package com.github.jntlvr.t21;

public class CartaoCredito implements Pagamento {
    Preco valor;
    public CartaoCredito(Preco valor) {
        this.valor = valor;
    }

    @Override
    public Preco valor() {
        return valor;
    }
}
