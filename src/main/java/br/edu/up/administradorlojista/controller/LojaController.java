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

import br.edu.up.administradorlojista.model.Loja;
import br.edu.up.administradorlojista.repository.LojaRepository;



@RestController
@RequestMapping("loja")
public class LojaController {

	@Autowired
	private LojaRepository repository;
	
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Loja> listAll(){
		Iterable<Loja> list = repository.findAll();
		return list;		
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Loja getById(@PathVariable Integer id) {
		Loja loja = repository.getOne(id);
		return loja;
	}
	
	@PostMapping("/cadastrar_loja")
	public Loja add(@RequestBody @Valid Loja loja) {
		return repository.save(loja);
	}
	
	@DeleteMapping("/{id}")
	public Loja delete(@PathVariable Integer id) {
		Loja loja = repository.getOne(id);
		repository.delete(loja);
		return loja;
		
	}
	
	@GetMapping("/situacao={situacao}")
	public @ResponseBody Iterable<Loja> getAllBySituacao(@PathVariable String situacao) {
		Iterable<Loja> loja = repository.getAllBySituacao(situacao);
		return loja;
	}
	
	@GetMapping("/categoria={categoria}")
	public @ResponseBody Iterable<Loja> getAllByCategoria(@PathVariable String categoria) {
		Iterable<Loja> loja = repository.getAllByCategoria(categoria);
		return loja;
	}
		
}