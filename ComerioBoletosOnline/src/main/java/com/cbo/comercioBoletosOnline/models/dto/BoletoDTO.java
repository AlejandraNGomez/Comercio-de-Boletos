package com.cbo.comercioBoletosOnline.models.dto;

import org.springframework.stereotype.Service;

import com.cbo.comercioBoletosOnline.models.entity.BoletoEntity;
import com.cbo.comercioBoletosOnline.models.pojo.Boleto;
import com.cbo.comercioBoletosOnline.models.pojo.Cinema;
import com.cbo.comercioBoletosOnline.models.pojo.Pelicula;
import com.cbo.comercioBoletosOnline.models.pojo.Sala;

@Service
public class BoletoDTO {

	public Boleto createPOJOfromEntity(BoletoEntity boletos) {
		Cinema cinema = new Cinema();
		cinema.setId(boletos.getCinemaId());
		Sala sala = new Sala();
		sala.setId(boletos.getSalaId());
		Pelicula peli = new Pelicula();
		peli.setId(boletos.getPeliculaId());
		return new Boleto(boletos.getId(), boletos.getCedulaCliente(), sala, boletos.getSillas(), peli, cinema);
	}

	public BoletoEntity createEntityfromPOJO(Boleto boletos) {

		return new BoletoEntity(boletos.getId(), boletos.getCedulaCliente(), boletos.getSala().getId(),
				boletos.getSillas(), boletos.getPelicula().getId(), boletos.getCinema().getId());
	}
}
