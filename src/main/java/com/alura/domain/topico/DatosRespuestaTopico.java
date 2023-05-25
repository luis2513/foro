package com.alura.domain.topico;

public record DatosRespuestaTopico(Long id, String titulo,String mensaje, StatusTopico status,
                                   String fecha, String author, Curso curso) {
}
