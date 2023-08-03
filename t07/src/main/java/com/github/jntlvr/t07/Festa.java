package com.github.jntlvr.t07;

import java.util.TreeSet;

public class Festa {

    private TreeSet<Convidado> convidados = new TreeSet<>();

    public void novoConvidado(Convidado c){
        convidados.add(c);
    }

    public Festa(Convidado c){
        convidados.add(c);
    }
}
