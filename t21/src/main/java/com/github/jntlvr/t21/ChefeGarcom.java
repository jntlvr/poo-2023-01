package com.github.jntlvr.t21;

import java.util.List;

public class ChefeGarcom extends Garcom {
    private List<Garcom> equipe;
    private List<GarcomBebidas> equipebebidas;

    public void adicionarGarcomEquipe(Garcom garcom) {
        equipe.add(garcom);
    }

    public void adicionarGarcomBebidas(GarcomBebidas garcombebida) {
        equipebebidas.add(garcombebida);
    }
}
