package com.github.jntlvr.t21;

import java.util.Objects;

public class Preco {
    private double valor;
    private Moeda moeda;

    public Preco(double valor, Moeda moeda) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido.");
        }

        Objects.requireNonNull(moeda, "Não pode ser nulo");

        this.valor = valor;
        this.moeda = moeda;
    }

    public double getValor() {
        return valor;
    }

    public Moeda getMoeda() {

        return moeda;
    }

    public static Preco reais(double valor) {

        return new Preco(valor, Moeda.REAL);
    }

    public static void main(String[] args) {

        System.out.println(Preco.reais(50));
    }

    public Preco adiciona(Preco valor) {
        if (moeda != valor.getMoeda()) {
            throw new IllegalArgumentException("Não é possível somar moedas diferentes.");
        }
        return new Preco(valor.getValor() + getValor(), moeda);
    }
}
