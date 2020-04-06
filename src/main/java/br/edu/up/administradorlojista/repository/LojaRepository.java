package br.edu.up.administradorlojista.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.up.administradorlojista.model.Loja;

public interface LojaRepository extends JpaRepository<Loja, Integer> {
	
	@Query(value ="SELECT * FROM Loja WHERE situacao =?1", nativeQuery = true)	
	List<Loja> getAllBySituacao(String situacao);
	
}
