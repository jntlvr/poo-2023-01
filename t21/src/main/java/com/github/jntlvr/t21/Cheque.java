package com.github.jntlvr.t21;

public class Cheque implements Pagamento {
    Preco valor;
    public Cheque(Preco valor) {
        this.valor = valor;
    }

    @Override
    public Preco valor() {
        return valor;
    }
}
