package com.cbo.comercioBoletosOnline.models.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cbo.comercioBoletosOnline.models.dao.ICinemaDao;
import com.cbo.comercioBoletosOnline.models.dto.CinemaDTO;
import com.cbo.comercioBoletosOnline.models.entity.CinemaEntity;
import com.cbo.comercioBoletosOnline.models.pojo.Cinema;

@Service
public class CinemaServiceImpl implements ICinemaServices{

	@Autowired
	private ICinemaDao cinemaDao;
	@Autowired
	private CinemaDTO cinemaDto;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cinema> findAll() {
		List<Cinema> cinemas = new ArrayList<Cinema>();
		for (CinemaEntity peli :cinemaDao.findAll()) {
			if (peli != null)
				cinemas.add(this.cinemaDto.createPOJOfromEntity(peli));
		}

		return cinemas;

	}

	@Override
	@Transactional(readOnly = true)
	public Cinema findById(Long id) {
		
		return this.cinemaDto.createPOJOfromEntity(cinemaDao.findById(id).orElse(null));
	}

	@Override
	@Transactional
	public Cinema save(Cinema cinemas) {

		return this.cinemaDto.createPOJOfromEntity(cinemaDao.save(this.cinemaDto.createEntityfromPOJO(cinemas)));
	}
	
	@Override
	@Transactional
	public void delete(Long id) {

		cinemaDao.deleteById(id);
	}
	

}
