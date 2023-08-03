package com.github.jntlvr.t21;

import java.util.Set;

public class Prato {

    private String nome;

    private Preco preco;

    private Set<DiaDaSemana> dias;

    public boolean servidoEm(DiaDaSemana dia) {
        for (DiaDaSemana servido : dias) {
            if (servido == dia) {
                return true;
            }
        }
        return false;
    }
}
