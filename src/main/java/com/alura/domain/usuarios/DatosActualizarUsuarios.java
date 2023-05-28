package com.alura.domain.usuarios;


import jakarta.validation.constraints.NotNull;

public record DatosActualizarUsuarios(@NotNull Long id, String nombre, String email, String contrasena) {
}
