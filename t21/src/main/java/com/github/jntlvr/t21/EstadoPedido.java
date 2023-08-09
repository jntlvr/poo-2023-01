package com.github.jntlvr.t21;

public enum EstadoPedido {
    EMANDAMENTO("Em andamento"),
    ENTREGUE("Entregue"),
    DEVOLVIDO("Devolvido");

    private final String descricao;

    EstadoPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
