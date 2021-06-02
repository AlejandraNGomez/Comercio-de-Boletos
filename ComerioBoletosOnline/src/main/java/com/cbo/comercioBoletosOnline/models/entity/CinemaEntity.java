package com.cbo.comercioBoletosOnline.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cinemas")
public class CinemaEntity implements Serializable {

	public CinemaEntity() {
		super();
	}

	public CinemaEntity(Long id, String nombre, String representanteLegalNombre,
			String representanteLegalIdentificacion, Date fechaConstitucion, String ciudad, String telefono,
			String email, String direccion, Long cantidadSalas, String latitud, String longitud) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.representanteLegalNombre = representanteLegalNombre;
		this.representanteLegalIdentificacion = representanteLegalIdentificacion;
		this.fechaConstitucion = fechaConstitucion;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
		this.cantidadSalas = cantidadSalas;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;

	@Column(name = "representante_legal_nombre")
	private String representanteLegalNombre;

	@Column(name = "representante_legal_identificacion")
	private String representanteLegalIdentificacion;

	@Column(name = "fecha_constitucion")
	@Temporal(TemporalType.DATE)
	private Date fechaConstitucion;

	private String ciudad;
	private String telefono;
	private String email;
	private String direccion;
	private String latitud;
	private String longitud;

	@Column(name = "cantidad_salas")
	private Long cantidadSalas;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getCantidadSalas() {
		return cantidadSalas;
	}

	public void setCantidadSalas(Long cantidadSalas) {
		this.cantidadSalas = cantidadSalas;
	}

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

	public String getRepresentanteLegalNombre() {
		return representanteLegalNombre;
	}

	public void setRepresentanteLegalNombre(String representanteLegalNombre) {
		this.representanteLegalNombre = representanteLegalNombre;
	}

	public String getRepresentanteLegalIdentificacion() {
		return representanteLegalIdentificacion;
	}

	public void setRepresentanteLegalIdentificacion(String representanteLegalIdentificacion) {
		this.representanteLegalIdentificacion = representanteLegalIdentificacion;
	}

	public Date getFechaConstitucion() {
		return fechaConstitucion;
	}

	public void setFechaConstitucion(Date fechaConstitucion) {
		this.fechaConstitucion = fechaConstitucion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
