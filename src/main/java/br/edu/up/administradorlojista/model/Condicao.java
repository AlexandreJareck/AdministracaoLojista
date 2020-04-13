package br.edu.up.administradorlojista.model;

public enum Condicao {

	MANUTENCAO(1), DISPONIVEL(2), LOCADO(3); // colocar mais status;

	private Integer index;
	
	Condicao(Integer index) {
		this.index = index;
	}
}
