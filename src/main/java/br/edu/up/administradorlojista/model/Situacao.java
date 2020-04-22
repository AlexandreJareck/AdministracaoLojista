package br.edu.up.administradorlojista.model;

public enum Situacao {
	
	LOCADO(1),
	DISPONIVEL(2),
	INDISPONIVEL(3),
	MANUTENÇÃO(4),
	INADIMPLENTE(5);

	private Integer descricao;
	
	public Integer getDescricao() {
		return descricao;
	}

	public void setDescricao(Integer descricao) {
		this.descricao = descricao;
	}

	Situacao(Integer descricao) {
		this.descricao = descricao;
	}

}
	