package com.github.jntlvr.t22;

public enum TipoBilhete {
    UNIVERSAL("Universal"),
    ESPECIFICO("Específico"),
    VISITANTE("Visitante");

    private final String descricao;

    TipoBilhete(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
