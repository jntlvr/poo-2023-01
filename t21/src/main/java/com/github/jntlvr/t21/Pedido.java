package com.github.jntlvr.t21;

import java.time.LocalTime;
import java.util.Set;

public class Pedido {
    private String numeroId;
    private Colaborador requisitadoPor;
    private LocalTime horaPedido;
    private Set<ItemPedido> itens;

    public Pedido(LocalTime horaPedido) {
        this.horaPedido = horaPedido;
    }

    public LocalTime getHoraPedido() {
        return horaPedido;
    }
}
