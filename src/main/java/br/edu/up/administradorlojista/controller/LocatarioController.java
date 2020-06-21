package br.edu.up.administradorlojista.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.administradorlojista.dto.LocatarioDTO;
import br.edu.up.administradorlojista.model.Locatario;
import br.edu.up.administradorlojista.model.Loja;
import br.edu.up.administradorlojista.model.Situacao;
import br.edu.up.administradorlojista.repository.LocatarioRepository;
import br.edu.up.administradorlojista.repository.LojaRepository;

@RestController
@RequestMapping("locatario")
public class LocatarioController {

	@Autowired
	private LocatarioRepository repository;
	
	@Autowired
	private LojaRepository lojaR;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<LocatarioDTO> listAll() {
		Iterable<Locatario> list = repository.findAll();
		
		List<LocatarioDTO> listDto = new ArrayList<>();
		
		for(Locatario locatario : list) {
			LocatarioDTO dto = new LocatarioDTO(locatario);
			listDto.add(dto);
		}
		
		return listDto;	
	}
	
	@GetMapping("/{id}")
	public @ResponseBody LocatarioDTO getById(@PathVariable Integer id) {
		Locatario locatario = repository.getOne(id);
		
		LocatarioDTO dto = new LocatarioDTO(locatario);
		
		return dto;
	}
	
	@PostMapping("/cadastrar_locatario")
	public Locatario add(@RequestBody @Valid LocatarioDTO locatarioDto) {
		Locatario locatario = new Locatario(locatarioDto);
		
		Loja loja = lojaR.getOne(locatarioDto.getLoja());
		
		loja.setSituacao(Situacao.LOCADO);
		locatario.setLoja(loja.getId());
		
		locatario = repository.save(locatario);
		loja.setLocatario(locatario.getId());

		lojaR.save(loja);
		
		return locatario;
	}
	
	@PutMapping("/{id}")
    public Locatario update(@PathVariable Integer id, @RequestBody @Valid LocatarioDTO locatarioDto) {
		Locatario locatario = new Locatario(locatarioDto);
        locatario.setId(id);
        
        Loja loja = lojaR.getOne(locatarioDto.getLoja());
        loja.setLocatario(locatarioDto.getId());
        
        return repository.save(locatario);
    }
	
	@DeleteMapping("/{id}")
	public Locatario delete(@PathVariable Integer id) {
		Locatario locatario = repository.getOne(id);
		repository.delete(locatario);
		return locatario;
	}
	
}