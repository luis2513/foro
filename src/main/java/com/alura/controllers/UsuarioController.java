package com.alura.controllers;

import com.alura.domain.usuarios.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @PostMapping
    public ResponseEntity<DatosRespuestaUsuario> registrarUsuarios(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario,
                                                                 UriComponentsBuilder uriComponentsBuilder){
        Usuario usuario = usuariosRepository.save(new Usuario(datosRegistroUsuario));
        DatosRespuestaUsuario datosRespuestaUsuario = new DatosRespuestaUsuario(usuario.getId(),
                usuario.getNombre(), usuario.getEmail(),
                usuario.getContrasena());
        URI url = uriComponentsBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(url).body(datosRespuestaUsuario);
    }
    @PutMapping
    @Transactional
    public ResponseEntity ActualizarUsuario(@RequestBody @Valid DatosActualizarUsuarios datosActualizarUsuarios){
        Usuario usuario = usuariosRepository.getReferenceById(datosActualizarUsuarios.id());
        usuario.actualizarDatoss(datosActualizarUsuarios);
        return ResponseEntity.ok(new DatosRespuestaUsuario(usuario.getId(), usuario.getNombre(), usuario.getEmail(), usuario.getContrasena()));


    }
    @GetMapping
    public ResponseEntity<Page<DatosListadoUsuario>> listadoUsuarios(@PageableDefault(size = 5)Pageable paginacion){
         return ResponseEntity.ok(usuariosRepository.findByActivadoTrue(paginacion).map(DatosListadoUsuario::new));
    }


    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eleminarUsuario(@PathVariable Long id){
        Usuario usuario = usuariosRepository.getReferenceById(id);
        usuario.desactivarUsuario();
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaUsuario> retornarDatosUsuario(@PathVariable Long id) {
        Usuario usuario = usuariosRepository.getReferenceById(id);
        var datosUsuario = new DatosRespuestaUsuario(usuario.getId(),
                usuario.getNombre(), usuario.getEmail(), usuario.getContrasena());
        return ResponseEntity.ok(datosUsuario);
    }
}


