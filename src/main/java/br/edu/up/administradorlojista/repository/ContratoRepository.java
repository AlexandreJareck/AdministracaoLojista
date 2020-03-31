package br.edu.up.administradorlojista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.administradorlojista.model.Contrato;

public interface ContratoRepository extends JpaRepository<Contrato, Integer> {

}
