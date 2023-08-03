package com.github.jntlvr.t18;

public class Lance {

    private int numeroLance;
    private Peca peca;
    private Jogador jogador;
    private Posicao posicaoDestino;
    public Lance(int numeroLance, Jogador jogador, Peca peca, Posicao posicaoDestino) {
        this.numeroLance = numeroLance;
        this.peca = peca;
        this.jogador = jogador;
        this.posicaoDestino = posicaoDestino;
    }

    @Override
    public String toString() {
        return "\nLance " + numeroLance +
                ". Jogador " + jogador +
                " moveu " + peca +
                " para " + posicaoDestino;
    }
}
