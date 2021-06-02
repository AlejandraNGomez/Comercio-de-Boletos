package com.cbo.comercioBoletosOnline.models.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cbo.comercioBoletosOnline.models.dao.ISalaDao;
import com.cbo.comercioBoletosOnline.models.dto.SalaDTO;
import com.cbo.comercioBoletosOnline.models.entity.SalaEntity;
import com.cbo.comercioBoletosOnline.models.pojo.Sala;

@Service
public class SalaServiceImpl implements ISalaService{

	@Autowired
	private ISalaDao salaDao;
	@Autowired
	private SalaDTO salaDto;
	
	@Override
	@Transactional(readOnly = true)
	public List<Sala> findAll() {
		List<Sala> salas = new ArrayList<Sala>();
		for (SalaEntity sala :salaDao.findAll()) {
			if (sala != null)
				salas.add(this.salaDto.createPOJOfromEntity(sala));
		}

		return salas;

	}

	@Override
	@Transactional(readOnly = true)
	public Sala findById(Long id) {
		
		return this.salaDto.createPOJOfromEntity(salaDao.findById(id).orElse(null));
	}

	@Override
	@Transactional
	public Sala save(Sala sala) {

		return this.salaDto.createPOJOfromEntity(salaDao.save(this.salaDto.createEntityfromPOJO(sala)));
	}
	
	@Override
	@Transactional
	public void delete(Long id) {

		salaDao.deleteById(id);
	}

	

}
