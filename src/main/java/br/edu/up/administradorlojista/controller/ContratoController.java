package br.edu.up.administradorlojista.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.administradorlojista.model.Contrato;
import br.edu.up.administradorlojista.repository.ContratoRepository;

@RestController
@RequestMapping("contrato")
public class ContratoController {

	@Autowired
	private ContratoRepository repository;
	
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Contrato> listAll(){
		Iterable<Contrato> list = repository.findAll();
		return list;		
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Contrato getById(@PathVariable Integer id) {
		Contrato contrato = repository.getOne(id);
		return contrato;
	}
	
	@PostMapping
	public Contrato add(@RequestBody @Valid Contrato contrato) {
		return repository.save(contrato);
	}
	
	@DeleteMapping("/{id}")
	public Contrato delete(@PathVariable Integer id) {
		Contrato contrato = repository.getOne(id);
		repository.delete(contrato);
		return contrato;
		
	}
	
}