package com.github.jntlvr.t18;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private String nome;
    private List<Lance> lances = new ArrayList<>();

    public Partida(String nome) {
        this.nome = nome;
    }

    public void adicionaLance(Lance lance) {
        lances.add(lance);
    }
    @Override
    public String toString() {
        return "Partida = " + nome +
                " lances: " + lances +
                '.';
    }
}
