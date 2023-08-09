package com.github.jntlvr.t21;

import java.util.List;

public class Gerente implements Colaborador {

    private List<Colaborador> equipe;

    public void adicionarColaboradorEquipe(Colaborador funcionario) {
        equipe.add(funcionario);
    }

}
