package com.alura.domain.usuarios;


import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByNombre(String username);

    Page<Usuario> findByActivadoTrue(Pageable paginacion);


}
