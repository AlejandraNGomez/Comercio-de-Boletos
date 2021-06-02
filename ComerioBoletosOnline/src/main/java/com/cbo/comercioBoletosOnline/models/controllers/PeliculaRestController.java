package com.cbo.comercioBoletosOnline.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.cbo.comercioBoletosOnline.models.pojo.Pelicula;
import com.cbo.comercioBoletosOnline.models.services.IPeliculaServices;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PeliculaRestController {
	
	@Autowired
	private IPeliculaServices peliculaService;

	@GetMapping("/peliculas")
	public List<Pelicula> index(){
		return peliculaService.findAll();
	}

	@GetMapping("/peliculas/b/{nombreCiudad}")
	public  List<Pelicula> show(@PathVariable String nombreCiudad){	
		
		return peliculaService.findByNameCity(nombreCiudad);
	}

	@GetMapping("/peliculas/{id}")
	public Pelicula show(@PathVariable Long id){
		return peliculaService.findById(id);
	}
	@GetMapping("/peliculas/cinema/{idCinema}")
	public List<Pelicula> showPeliculasXCinema(@PathVariable Long idCinema){
		return peliculaService.findByIdCinema(idCinema);
	}
	
	@PostMapping("/peliculas")
	@ResponseStatus(HttpStatus.CREATED)
	public Pelicula create(@RequestBody Pelicula peliculas) {
		return peliculaService.save(peliculas);
	}

	@PutMapping("/peliculas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Pelicula update(@RequestBody Pelicula peliculas, @PathVariable Long id){
		Pelicula peliculaActual = peliculaService.findById(id);
		peliculaActual.setNombre(peliculas.getNombre());
		return peliculaService.save(peliculaActual);
		
	}
	
	@DeleteMapping("/peliculas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id){
		peliculaService.delete(id);
	}

}
