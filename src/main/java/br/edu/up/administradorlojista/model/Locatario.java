package br.edu.up.administradorlojista.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.edu.up.administradorlojista.dto.LocatarioDTO;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "LOCATARIO")
public class Locatario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Locatario() {}
	
	public Locatario(LocatarioDTO dto){
		
		Contato contato = new Contato();
		Endereco endereco = new Endereco();
		Contrato contrato = new Contrato();
		
		this.nome = dto.getNome();
		this.documento = dto.getDocumento();
		contato.setCelular(dto.getCelular());
		contato.setComercial(dto.getComercial());
		contato.setEmail(dto.getEmail());
		contato.setResidencial(dto.getResidencial());
		contrato.setAluguel(dto.getAluguel());
		contrato.setDataFim(dto.getDataFim());
		contrato.setDataInicio(dto.getDataInicio());
		contrato.setDataVencimento(dto.getDataVencimento());
		contrato.setDescricao(dto.getDescricao());
		contrato.setInadimplente(false);
		endereco.setBairro(dto.getBairro());
		endereco.setCep(dto.getCep());
		endereco.setCidade(dto.getCidade());
		endereco.setNumero(dto.getNumero());
		endereco.setRua(dto.getRua());
		endereco.setUf(dto.getUf());
		
		this.contato = contato;
		this.endereco = endereco;
		this.contrato = contrato;
		this.loja = dto.getLoja();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "Nome", nullable = false)
	private String nome;
	
	@Column(name = "Documento", nullable = false)
	private String documento;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Contato contato;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Contrato contrato;
	
	@Column(name = "Loja", nullable = false)
	private Integer loja;

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

	public Integer getLoja() {
		return loja;
	}

	public void setLoja(Integer loja) {
		this.loja = loja;
	}
	
}
