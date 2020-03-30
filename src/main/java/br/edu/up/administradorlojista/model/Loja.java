package br.edu.up.administradorlojista.model;

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

@Entity
@Table(name = "LOJA")
public class Loja {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "CodigoLoja", nullable = false)
	private String codigoLoja;
	
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
    private Condicao condicao;
    
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

	public Condicao getCondicao() {
		return condicao;
	}

	public void setCondicao(Condicao condicao) {
		this.condicao = condicao;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

}
