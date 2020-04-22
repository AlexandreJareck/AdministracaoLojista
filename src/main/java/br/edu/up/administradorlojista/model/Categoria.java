package br.edu.up.administradorlojista.model;

public enum Categoria {
	
	ALIMENTOS("Praça de Alimentação"),
	ROUPAS("Roupas em geral"),
	TECNOLOGIA("Aparelhos de tecnologia"),
	DECORAÇÃO("Artefatos decorativos"),
	BRINQUEDOS("Artefatos infantis"),
	ENTRETENIMENTO("Cinemas...");
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	Categoria(String descricao) {
		this.descricao = descricao;	
	}	
}
