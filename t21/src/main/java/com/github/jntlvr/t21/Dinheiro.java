package com.github.jntlvr.t21;

public class Dinheiro implements Pagamento {
    Preco valor;
    public Dinheiro(Preco valor) {
        this.valor = valor;
    }

    @Override
    public Preco valor() {
        return valor;
    }
}
