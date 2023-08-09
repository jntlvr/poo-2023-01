package com.github.jntlvr.t21;

import java.util.List;

public class ChefeCozinha extends Cozinheiro {
    private List<Cozinheiro> equipe;

    public void adicionarCozinheiroEquipe(Cozinheiro cozinheiro) {
        equipe.add(cozinheiro);
    }
}
