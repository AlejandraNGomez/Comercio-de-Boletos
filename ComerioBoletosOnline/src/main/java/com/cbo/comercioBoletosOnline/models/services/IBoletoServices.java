package com.cbo.comercioBoletosOnline.models.services;

import java.util.List;

import com.cbo.comercioBoletosOnline.models.pojo.Boleto;

public interface IBoletoServices {

	public List<Boleto> findAll();

	public Boleto findById(Long id);
	
	public List<Boleto> findByCedId(Long id);
	
	public Boleto save(Boleto boleto);
	
	public void delete(Long id);
		
}