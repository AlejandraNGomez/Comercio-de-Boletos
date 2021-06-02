package com.cbo.comercioBoletosOnline.models.pojo;

import java.util.Date;

public class Cinema {
	private Long id;
	private String nombre;
	private String representanteLegalNombre;
	private String representanteLegalIdentificacion;
	private Date fechaConstitucion;
	private String ciudad;
	private String telefono;
	private String email;
	private String direccion;
	private Long cantidadSalas;
	private String latitud;
	private String longitud;
	

	public Cinema() {
		super();
	}
	

	public Cinema(Long id, String nombre, String representanteLegalNombre, String representanteLegalIdentificacion,
			Date fechaConstitucion, String ciudad, String telefono, String email, String direccion, Long cantidadSalas, String latitud, String longitud) {
		setId(id);
		setNombre(nombre);
		setRepresentanteLegalNombre(representanteLegalNombre);
		setRepresentanteLegalIdentificacion(representanteLegalIdentificacion);
		setFechaConstitucion(fechaConstitucion);
		setCiudad(ciudad);
		setTelefono(telefono);
		setEmail(email);
		setDireccion(direccion);
		setCantidadSalas(cantidadSalas);
		setLatitud(latitud);
		setLongitud(longitud);
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
}
