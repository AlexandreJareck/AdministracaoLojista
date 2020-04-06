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

import br.edu.up.administradorlojista.model.Locatario;
import br.edu.up.administradorlojista.repository.LocatarioRepository;



@RestController
@RequestMapping("locatario")
public class LocatarioController {

	@Autowired
	private LocatarioRepository repository;
	
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Locatario> listAll(){
		Iterable<Locatario> list = repository.findAll();
		return list;		
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Locatario getById(@PathVariable Integer id) {
		Locatario locatario = repository.getOne(id);
		return locatario;
	}
	
	@PostMapping
	public Locatario add(@RequestBody @Valid Locatario locatario) {
		return repository.save(locatario);
	}
	
	@DeleteMapping("/{id}")
	public Locatario delete(@PathVariable Integer id) {
		Locatario locatario = repository.getOne(id);
		repository.delete(locatario);
		return locatario;
		
	}
	
}