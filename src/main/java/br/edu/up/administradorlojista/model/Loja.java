package br.edu.up.administradorlojista.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "LOJA")
public class Loja implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "CodigoLoja", nullable = false)
	private String codigoLoja;
	
	@Column(name = "NomeLoja", nullable = false)
	private String nomeLoja;
	
	@Column(name = "ValorAluguel", nullable = false)
	private Double valorAluguel;
	
	@Column(name = "Tamanho", nullable = false)
	private Double tamanho;
	
	@Column(name = "Setor", nullable = false)
	private String setor;

	@ManyToOne(cascade = CascadeType.ALL)
	private Locatario locatario;
	
	@Enumerated(EnumType.STRING)
    @Column(length = 100)
    private Categoria categoria;
      
    @Enumerated(EnumType.STRING)
    @Column(length = 100)
    private Situacao situacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoLoja() {
		return codigoLoja;
	}

	public void setCodigoLoja(String codigoLoja) {
		this.codigoLoja = codigoLoja;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public Double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(Double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Locatario getLocatario() {
		return locatario;
	}

	public void setLocatario(Locatario locatario) {
		this.locatario = locatario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
