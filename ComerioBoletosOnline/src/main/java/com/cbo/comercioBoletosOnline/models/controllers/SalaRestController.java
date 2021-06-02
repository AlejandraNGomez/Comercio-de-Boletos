package com.cbo.comercioBoletosOnline.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbo.comercioBoletosOnline.models.pojo.Sala;
import com.cbo.comercioBoletosOnline.models.services.ISalaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class SalaRestController {

	@Autowired
	private ISalaService salaService;

	@GetMapping("/sala")
	public List<Sala> index(){
		return salaService.findAll();
	}

	@GetMapping("/sala/{id}")
	public Sala show(@PathVariable Long id){
		return salaService.findById(id);
	}
}
