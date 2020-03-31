package br.edu.up.administradorlojista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.administradorlojista.model.Locatario;

public interface LocatarioRepository extends JpaRepository<Locatario, Integer> {

}
