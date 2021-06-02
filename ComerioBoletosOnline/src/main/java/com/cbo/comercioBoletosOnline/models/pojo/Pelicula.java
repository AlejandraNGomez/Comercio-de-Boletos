package com.cbo.comercioBoletosOnline.models.pojo;

public class Pelicula {
	private Long id;
	private String nombre;
	private Cinema cinema;
	private String caratula;
	private String descripcion;
	private String categoria;
	private Sala sala;


	public Pelicula() {
		super();
	}

	public Pelicula(Long id, String nombre, Cinema cinema, String caratula, String descripcion, String categoria,
			Sala sala) {
		setId(id);
		setNombre(nombre);
		setCinema(cinema);
		setCaratula(caratula);
		setDescripcion(descripcion);
		setCategoria(categoria);
		setSala(sala);
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

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public String getCaratula() {
		return caratula;
	}

	public void setCaratula(String caratula) {
		this.caratula = caratula;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

}
