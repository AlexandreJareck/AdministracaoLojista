package br.edu.up.administradorlojista.model;

public enum Situacao {
	
	ALUGADO("Loja se encontra alugada"), DISPONIVEL("Loja disponivel"); // colocar mais status

	private String descricao;
	
	Situacao(String descricao) {
		this.descricao = descricao;
	}

}
	