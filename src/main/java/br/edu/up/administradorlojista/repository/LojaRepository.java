package br.edu.up.administradorlojista.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.up.administradorlojista.model.Loja;

public interface LojaRepository extends JpaRepository<Loja, Integer> {
	
	@Query(value ="SELECT * FROM Loja WHERE situacao =?", nativeQuery = true)	
	List<Loja> getAllBySituacao(String situacao);
	
	@Query(value ="SELECT * FROM Loja WHERE categoria =?", nativeQuery = true)
	List<Loja> getAllByCategoria(String categoria);
	
	@Query(value ="SELECT * FROM Loja WHERE condicao=?", nativeQuery = true)
	List<Loja> getAllByCondicao(String condicao);
	
	@Query(value ="SELECT SUM(valor_aluguel) as Faturamento_Mensal FROM loja WHERE situacao='LOCADO'", nativeQuery = true)
	Double getAllByAluguel();
	
	// como fazer a desgraça desse metodo?
	
}
