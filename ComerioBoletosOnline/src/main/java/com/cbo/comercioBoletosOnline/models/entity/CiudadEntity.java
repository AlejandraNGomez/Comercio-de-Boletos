package com.cbo.comercioBoletosOnline.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciudad")
public class CiudadEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Long cinemasId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getCinemasId() {
		return cinemasId;
	}
	public void setCinemasId(Long cinemasId) {
		this.cinemasId = cinemasId;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
