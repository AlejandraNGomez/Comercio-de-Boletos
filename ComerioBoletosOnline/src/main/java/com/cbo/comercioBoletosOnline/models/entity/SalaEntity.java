package com.cbo.comercioBoletosOnline.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salas")
public class SalaEntity implements Serializable {

	public SalaEntity() {
		super();
	}
	
	public SalaEntity(Long id, Long numero, Long cantSillas, Long idPelicula, Long idCinema) {
		super();
		this.id = id;
		this.numero = numero;
		this.cantSillas = cantSillas;
		this.idPelicula = idPelicula;
		this.idCinema = idCinema;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long numero;

	@Column(name="cant_sillas")
	private Long cantSillas;

	@Column(name="id_pelicula")
	private Long idPelicula;
	
	@Column(name="id_cinema")
	private Long idCinema;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	public Long getCantSillas() {
		return cantSillas;
	}
	public void setCantSillas(Long cantSillas) {
		this.cantSillas = cantSillas;
	}

	public Long getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(Long idPelicula) {
		this.idPelicula = idPelicula;
	}

	public Long getIdCinema() {
		return idCinema;
	}
	public void setIdCinema(Long idCinema) {
		this.idCinema = idCinema;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
