package com.cbo.comercioBoletosOnline.models.pojo;

public class Boleto {
	Long id;
	Long cedulaCliente;
	Sala sala;
	String sillas;
	Pelicula pelicula;
	Cinema cinema;

	public Boleto() {
		super();
	}

	public Boleto(Long id, Long cedulaCliente, Sala sala, String sillas, Pelicula pelicula, Cinema cinema) {
		super();
		this.id = id;
		this.cedulaCliente = cedulaCliente;
		this.sala = sala;
		this.sillas = sillas;
		this.pelicula = pelicula;
		this.cinema = cinema;
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

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String getSillas() {
		return sillas;
	}

	public void setSillas(String sillas) {
		this.sillas = sillas;
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
