package com.cbo.comercioBoletosOnline.models.services;

import java.util.List;
import com.cbo.comercioBoletosOnline.models.pojo.Pelicula;

public interface IPeliculaServices {

	public List<Pelicula> findAll();
	
	public Pelicula findById(Long id);

	public Pelicula save(Pelicula peliculas);
	
	public void delete(Long id);
	
	public List<Pelicula> findByNameCity(String nombreCiudad);
	
	public List<Pelicula> findByIdCinema(Long idcinema);
	
}
