package com.cbo.comercioBoletosOnline.models.pojo;

public class Sala {

	private Long id;
	private Long numero;
	private Long cantSillas;
	private Pelicula pelicula;
	private Cinema cinema;


	public Sala() {
		super();
	}

	public Sala(Long id, Long numero, Long cantSillas, Pelicula pelicula, Cinema cinema) {
		super();
		this.id = id;
		this.numero = numero;
		this.cantSillas = cantSillas;
		this.pelicula = pelicula;
		this.cinema = cinema;
	}
	
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
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	
	
	
}
