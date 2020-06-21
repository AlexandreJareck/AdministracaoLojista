package br.edu.up.administradorlojista.dto;

import br.edu.up.administradorlojista.model.Loja;

public class LojaDTO {
	
	public LojaDTO() {}
	
	public LojaDTO(Loja loja) {
		id = loja.getId();
		codigoLoja = loja.getCodigoLoja();
		nomeLoja = loja.getNomeLoja();
		valorAluguel = loja.getValorAluguel();
		tamanho = loja.getTamanho();
		setor = loja.getSetor();
		categoria = loja.getCategoria().name();
		situacao = loja.getSituacao().name();
		if(loja.getLocatario() != null)
			locatario = loja.getLocatario();	
	}
	
	public Integer id;
	public String codigoLoja;
	public String nomeLoja;
	public double valorAluguel;
	public double tamanho;
	public String setor;
	public String categoria;
	public String situacao;
	public Integer locatario;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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

	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Integer getLocatario() {
		return locatario;
	}
	public void setLocatario(Integer locatario) {
		this.locatario = locatario;
	}

}
