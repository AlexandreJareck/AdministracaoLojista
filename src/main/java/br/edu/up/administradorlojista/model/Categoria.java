package br.edu.up.administradorlojista.model;

public enum Categoria {

    ALIMENTOS(1),
    ROUPAS(2),
    TECNOLOGIA(3),
    DECORAÇÃO(4),
    BRINQUEDOS(5),
    ENTRETENIMENTO(6);

    public Integer index;

    public Integer getDescricao() {
        return index;
    }

    public void setDescricao(Integer index) {
        this.index = index;
    }

    Categoria(Integer index) {
        this.index = index;
    }
}
