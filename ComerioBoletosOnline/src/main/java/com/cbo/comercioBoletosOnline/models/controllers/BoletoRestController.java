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

import com.cbo.comercioBoletosOnline.models.pojo.Boleto;
import com.cbo.comercioBoletosOnline.models.services.IBoletoServices;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class BoletoRestController {
	
	@Autowired
	private IBoletoServices boletoService;

	@GetMapping("/boletos")
	public List<Boleto> index(){
		return boletoService.findAll();
	}

	@GetMapping("/boletos/{id}")
	public Boleto show(@PathVariable Long id){
		return boletoService.findById(id);
	}
	@GetMapping("/boletos/cedula/{id}")
	public List<Boleto> showByCed(@PathVariable Long id){
		return boletoService.findByCedId(id);
	}
	
	@PostMapping("/boletos")
	@ResponseStatus(HttpStatus.CREATED)
	public Boleto create(@RequestBody Boleto Boletos) {
		return boletoService.save(Boletos);
	}

	@PutMapping("/boletos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Boleto update(@RequestBody Boleto boletos, @PathVariable Long id){
		
		return null;
		
	}
	
	@DeleteMapping("/boletos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id){
		boletoService.delete(id);
	}

}
