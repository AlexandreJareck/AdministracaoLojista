package br.edu.up.administradorlojista.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.edu.up.administradorlojista.dto.LocatarioDTO;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "LOCATARIO")
public class Locatario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Locatario(LocatarioDTO dto){
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "Nome", nullable = false)
	private String nome;
	
	@Column(name = "Documento", nullable = false)
	private String documento;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Contato contato;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Contrato contrato;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
