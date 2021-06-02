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

import com.cbo.comercioBoletosOnline.models.pojo.Cinema;
import com.cbo.comercioBoletosOnline.models.services.ICinemaServices;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CinemaRestController {
	
	@Autowired
	private ICinemaServices cinemaService;

	@GetMapping("/cinemas")
	public List<Cinema> index(){
		return cinemaService.findAll();
	}

	@GetMapping("/cinemas/{id}")
	public Cinema show(@PathVariable Long id){
		return cinemaService.findById(id);
	}
		
	@PostMapping("/cinemas")
	@ResponseStatus(HttpStatus.CREATED)
	public Cinema create(@RequestBody Cinema cinemas) {
		return cinemaService.save(cinemas);
	}

	@PutMapping("/cinemas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cinema update(@RequestBody Cinema cinemas, @PathVariable Long id){
		Cinema cinemaActual = cinemaService.findById(id);
		cinemaActual.setNombre(cinemas.getNombre());
		cinemaActual.setRepresentanteLegalNombre(cinemas.getRepresentanteLegalNombre());
		cinemaActual.setRepresentanteLegalIdentificacion(cinemas.getRepresentanteLegalIdentificacion());
		cinemaActual.setFechaConstitucion(cinemas.getFechaConstitucion());
		cinemaActual.setTelefono(cinemas.getTelefono());
		cinemaActual.setCiudad(cinemas.getCiudad());
		cinemaActual.setEmail(cinemas.getEmail());
		
		return cinemaService.save(cinemaActual);
		
	}
	
	@DeleteMapping("/cinemas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id){
		cinemaService.delete(id);
	}

}
