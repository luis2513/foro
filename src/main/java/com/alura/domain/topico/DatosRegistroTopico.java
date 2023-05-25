package com.alura.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        Status status,
        @NotBlank
        String fecha,
        @NotBlank
        String author,
        Curso curso
) {
}
