package com.alura.controllers;

import com.alura.domain.topico.DatosRegistroTopico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class topicoControllerTest {

    @PostMapping
    public void registrarTopico(@RequestBody DatosRegistroTopico datosTopicos) {
        System.out.println(datosTopicos);

    }
}