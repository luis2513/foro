package com.alura.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopicos(@NotNull Long id, String titulo, String mensaje, String author, Curso curso) {
}
