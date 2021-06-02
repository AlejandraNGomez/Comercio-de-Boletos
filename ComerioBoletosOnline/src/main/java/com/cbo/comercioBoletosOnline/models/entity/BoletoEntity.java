package com.cbo.comercioBoletosOnline.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boleto")
public class BoletoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name = "cedula_cliente")
	Long cedulaCliente;
	@Column(name = "sala_id")
	Long salaId;
	String sillas;
	@Column(name = "pelicula_id")
	Long peliculaId;
	@Column(name = "cinema_id")
	Long cinemaId;

	public BoletoEntity() {
		super();
	}

	public BoletoEntity(Long id, Long cedulaCliente, Long salaId, String sillas, Long peliculaId, Long cinemaId) {
		super();
		this.id = id;
		this.cedulaCliente = cedulaCliente;
		this.salaId = salaId;
		this.sillas = sillas;
		this.peliculaId = peliculaId;
		this.cinemaId = cinemaId;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(Long cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public Long getSalaId() {
		return salaId;
	}

	public void setSalaId(Long salaId) {
		this.salaId = salaId;
	}

	public String getSillas() {
		return sillas;
	}

	public void setSillas(String sillas) {
		this.sillas = sillas;
	}

	public Long getPeliculaId() {
		return peliculaId;
	}

	public void setPeliculaId(Long peliculaId) {
		this.peliculaId = peliculaId;
	}

	public Long getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(Long cinemaId) {
		this.cinemaId = cinemaId;
	}

}
