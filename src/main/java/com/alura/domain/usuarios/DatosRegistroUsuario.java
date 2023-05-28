package com.alura.domain.usuarios;

import com.alura.domain.topico.Status;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public record DatosRegistroUsuario(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String contrasena

) {
}
