package com.cbo.comercioBoletosOnline.models.services;

import java.util.List;

import com.cbo.comercioBoletosOnline.models.pojo.Sala;

public interface ISalaService {

	public List<Sala> findAll();

	public Sala findById(Long id);

	public Sala save(Sala peliculas);

	public void delete(Long id);
}
