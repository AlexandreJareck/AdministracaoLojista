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


import br.edu.up.administradorlojista.model.Contato;
import br.edu.up.administradorlojista.repository.ContatoRepository;

@RestController
@RequestMapping("contato")
public class ContatoController {

	@Autowired
	private ContatoRepository repository;
	
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Contato> listAll(){
		Iterable<Contato> list = repository.findAll();
		return list;		
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Contato getById(@PathVariable Integer id) {
		Contato contato = repository.getOne(id);
		return contato;
	}
	
	@PostMapping
	public Contato add(@RequestBody @Valid Contato contato) {
		return repository.save(contato);
	}
	
	@DeleteMapping("/{id}")
	public Contato delete(@PathVariable Integer id) {
		Contato contato = repository.getOne(id);
		repository.delete(contato);
		return contato;
		
	}
	 
	
	
}