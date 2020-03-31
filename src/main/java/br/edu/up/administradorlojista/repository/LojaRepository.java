package br.edu.up.administradorlojista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.administradorlojista.model.Loja;

public interface LojaRepository extends JpaRepository<Loja, Integer> {

}
