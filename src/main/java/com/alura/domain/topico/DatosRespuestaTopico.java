package com.alura.domain.topico;

public record DatosRespuestaTopico(Long id, String titulo,String mensaje, Status status,
                                   String fecha, String author, Curso curso) {
}
