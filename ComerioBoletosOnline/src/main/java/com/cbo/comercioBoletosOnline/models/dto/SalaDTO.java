package com.cbo.comercioBoletosOnline.models.dto;

import org.springframework.stereotype.Service;

import com.cbo.comercioBoletosOnline.models.entity.SalaEntity;
import com.cbo.comercioBoletosOnline.models.pojo.Cinema;
import com.cbo.comercioBoletosOnline.models.pojo.Pelicula;
import com.cbo.comercioBoletosOnline.models.pojo.Sala;

@Service
public class SalaDTO {
	
	public Sala createPOJOfromEntity(SalaEntity sala) {
		Pelicula pelicula = new Pelicula();
		pelicula.setId(sala.getIdPelicula());
		Cinema cinema = new Cinema();
		cinema.setId(sala.getIdCinema());
		
		return new Sala(sala.getId(), sala.getNumero(), sala.getCantSillas(), pelicula, cinema);
	}

	public SalaEntity createEntityfromPOJO(Sala sala) {


		return new SalaEntity(sala.getId(), sala.getNumero(), sala.getCantSillas(), sala.getPelicula().getId(), sala.getCinema().getId());
	}
}
