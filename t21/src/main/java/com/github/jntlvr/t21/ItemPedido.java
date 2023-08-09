package com.github.jntlvr.t21;

public class ItemPedido {
    private Prato prato;
    private int quantidade;
    private Bebida bebida;
    private String observacao;
    private EstadoPedido estado;

    public EstadoPedido getEstado() {
        return estado;
    }
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
}
