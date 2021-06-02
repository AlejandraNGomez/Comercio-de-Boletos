package com.cbo.comercioBoletosOnline.models.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cbo.comercioBoletosOnline.models.dao.IBoletoDao;
import com.cbo.comercioBoletosOnline.models.dto.BoletoDTO;
import com.cbo.comercioBoletosOnline.models.entity.BoletoEntity;
import com.cbo.comercioBoletosOnline.models.pojo.Boleto;

@Service
public class BoletoServiceImpl implements IBoletoServices {

	@Autowired
	private IBoletoDao boletoDao;
	@Autowired
	private BoletoDTO boletoDto;

	@Override
	@Transactional(readOnly = true)
	public List<Boleto> findAll() {
		List<Boleto> boleto = new ArrayList<Boleto>();
		for (BoletoEntity bolet : boletoDao.findAll()) {
			if (bolet != null)
				boleto.add(this.boletoDto.createPOJOfromEntity(bolet));
		}

		return boleto;

	}

	@Override
	@Transactional(readOnly = true)
	public Boleto findById(Long id) {

		return this.boletoDto.createPOJOfromEntity(boletoDao.findById(id).orElse(null));
	}

	@Override
	@Transactional
	public Boleto save(Boleto boleto) {

		return this.boletoDto.createPOJOfromEntity(boletoDao.save(this.boletoDto.createEntityfromPOJO(boleto)));
	}

	@Override
	@Transactional
	public void delete(Long id) {

		boletoDao.deleteById(id);
	}

	@Override
	public List<Boleto> findByCedId(Long idCliente) {
		List<Boleto> boletos = new ArrayList<Boleto>();
		for (BoletoEntity bol : this.boletoDao.findByCedId(idCliente)) {
			if (bol != null)
				boletos.add(this.boletoDto.createPOJOfromEntity(bol));
		}

		return boletos;
	}

}
