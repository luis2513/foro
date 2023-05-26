package com.alura.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        Status status,
        @NotBlank
        String fecha,
        @NotBlank
        String author,
        @NotNull
        Curso curso
) {
}
