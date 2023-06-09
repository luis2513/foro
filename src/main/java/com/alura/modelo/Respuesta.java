package com.alura.modelo;

import com.alura.domain.topico.Topico;

public class Respuesta {

	private Long id;
	private String mensaje;
	private Topico topico;
	private String fechaCreacion;
	private com.alura.domain.usuarios.Usuario autor;
	private Boolean solucion = false;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Respuesta other = (Respuesta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Topico getTopico() {
		return topico;
	}

	public void setTopico(Topico topico) {
		this.topico = topico;
	}

	public String getfechaCreacion() {
		return fechaCreacion;
	}

	public void setfechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public com.alura.domain.usuarios.Usuario getAutor() {
		return autor;
	}

	public void setAutor(com.alura.domain.usuarios.Usuario autor) {
		this.autor = autor;
	}

	public Boolean getSolucion() {
		return solucion;
	}

	public void setSolucion(Boolean solucion) {
		this.solucion = solucion;
	}

}
