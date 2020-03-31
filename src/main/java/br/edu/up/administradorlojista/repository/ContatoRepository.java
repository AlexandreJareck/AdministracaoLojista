package br.edu.up.administradorlojista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.administradorlojista.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
