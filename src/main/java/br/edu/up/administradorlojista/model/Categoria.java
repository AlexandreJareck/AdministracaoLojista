package br.edu.up.administradorlojista.model;

public enum Categoria {
	ALIMENTOS("Praça de Alimentação"), ROUPAS("Roupas em geral"); // colocar mais status

	private String descricao;
	
	Categoria(String descricao) {
		this.descricao = descricao;	
	}	
}
