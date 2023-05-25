package com.alura.domain.topico;

public record DatosListadoTopico(Long id, String titulo, String mensaje, StatusTopico status,String fecha,String author,Curso curso) {

    public DatosListadoTopico(Topico topico){
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getStatus(),
                topico.getFecha(),
                topico.getAuthor(),
                topico.getCurso()
        );
    }
}
