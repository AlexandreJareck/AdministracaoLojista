package br.edu.up.administradorlojista.model;

public enum Situacao {
	
	LOCADO(1), DISPONIVEL(2), INDISPONIVEL(3); // colocar mais status

	private Integer descricao;
	
	Situacao(Integer descricao) {
		this.descricao = descricao;
	}

}
	