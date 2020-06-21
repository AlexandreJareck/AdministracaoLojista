package br.edu.up.administradorlojista.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.administradorlojista.dto.LojaDTO;
import br.edu.up.administradorlojista.model.Locatario;
import br.edu.up.administradorlojista.model.Loja;
import br.edu.up.administradorlojista.repository.LocatarioRepository;
import br.edu.up.administradorlojista.repository.LojaRepository;



@RestController
@RequestMapping("loja")
public class LojaController {
	@Autowired
	private LojaRepository repository;
	
	@Autowired
	private LocatarioRepository locatarioR;
	
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<LojaDTO> listAll(){
		Iterable<Loja> list = repository.findAll();
		
		List<LojaDTO> listDto = new ArrayList<>();
		
		for(Loja loja : list) {
			LojaDTO dto = new LojaDTO(loja);
			listDto.add(dto);
		}
		
		return listDto;		
	}
	
	@GetMapping(path = "/listLojaDisponivel", produces = "application/json")
	public @ResponseBody Iterable<Loja> listLojaDisponivel(){
		Iterable<Loja> list = repository.findAll();
		List<Loja> listFilter = new ArrayList<>();
		
		for(Loja l : list) {
			if(l.getLocatario() == null) {
				listFilter.add(l);
			}
		}
		
		return listFilter;		
	}
	
	@GetMapping("/{id}")
	public @ResponseBody LojaDTO getById(@PathVariable Integer id) {
		Loja loja = repository.getOne(id);
		
		LojaDTO dto = new LojaDTO(loja);
		
		return dto;
	}
	
	@PostMapping("/cadastrar_loja")
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public Loja add(@RequestBody @Valid Loja loja) {		
		return repository.save(loja);
	}
	
	
	@PutMapping("/{id}")
    public Loja update(@PathVariable Integer id, @RequestBody @Valid LojaDTO dto)
    {
		Loja loja = new Loja(dto);
		loja.setId(id);
		
		Locatario locatario = locatarioR.getOne(dto.getLocatario());
		
		locatario.setLoja(loja.getId());
        
		locatarioR.save(locatario);
		
		return repository.save(loja);
    }
	
	@DeleteMapping("/{id}")
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
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
	
	@GetMapping("/faturamento")
	public @ResponseBody Double getAllByAluguel() {
		return repository.getAllByAluguel();
	}
		
}