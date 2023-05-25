package com.alura.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;


@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Service
public class Topico {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;

	private String mensaje;

	private StatusTopico status;

	private String fecha;

	private String author;

	private Curso curso;

	private Boolean activo;






	public Topico(DatosRegistroTopico datosRegistroTopico) {
		this.activo = true;
		this.titulo = datosRegistroTopico.titulo();
		this.mensaje = datosRegistroTopico.mensaje();
		this.status = datosRegistroTopico.status();
		this.fecha = datosRegistroTopico.fecha();
		this.author = datosRegistroTopico.author();
		this.curso = datosRegistroTopico.curso();

	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

    public void actualizarDatos(DatosActualizarTopicos datosActualizarTopicos) {
		if (datosActualizarTopicos.titulo() != null){
			this.titulo = datosActualizarTopicos.titulo();
		}
		if (datosActualizarTopicos.mensaje() != null) {
			this.mensaje = datosActualizarTopicos.mensaje();
		}
		if (datosActualizarTopicos.author() != null) {
			this.author = datosActualizarTopicos.author();
		}
		if (datosActualizarTopicos.curso() != null) {
			this.curso = datosActualizarTopicos.curso();
		}

    }

	public void desactivarTopico() {
		this.activo = false;
	}
}
