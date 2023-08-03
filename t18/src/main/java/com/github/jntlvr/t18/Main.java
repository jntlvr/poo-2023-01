package com.github.jntlvr.t18;

public class Main {
    public static void main(String[] args) {

        Partida partida = new Partida("Imortal");
        Jogador a = new Jogador("Anderssen");
        Jogador b = new Jogador("Kieseritzky");

        partida.adicionaLance(new Lance(1, a, Peca.PEAO, new Posicao(5, 4)));
        partida.adicionaLance(new Lance(2, b, Peca.PEAO, new Posicao(5, 5)));
        partida.adicionaLance(new Lance(3, a, Peca.PEAO, new Posicao(6, 4)));
        partida.adicionaLance(new Lance(4, b, Peca.PEAO, new Posicao(6, 4)));
        partida.adicionaLance(new Lance(5, a, Peca.BISPO, new Posicao(3, 4)));
        partida.adicionaLance(new Lance(6, b, Peca.RAINHA, new Posicao(8, 4)));
        partida.adicionaLance(new Lance(7, a, Peca.REI, new Posicao(6, 1)));
        partida.adicionaLance(new Lance(8, b, Peca.PEAO, new Posicao(2, 5)));
        partida.adicionaLance(new Lance(9, a, Peca.BISPO, new Posicao(2, 5)));
        partida.adicionaLance(new Lance(10, b, Peca.CAVALO, new Posicao(6, 6)));
        partida.adicionaLance(new Lance(11, a, Peca.CAVALO, new Posicao(6, 3)));
        partida.adicionaLance(new Lance(12, b, Peca.RAINHA, new Posicao(8, 6)));
        partida.adicionaLance(new Lance(13, a, Peca.PEAO, new Posicao(4, 3)));
        partida.adicionaLance(new Lance(14, b, Peca.CAVALO, new Posicao(8, 5)));
        partida.adicionaLance(new Lance(15, a, Peca.CAVALO, new Posicao(8, 4)));
        partida.adicionaLance(new Lance(16, b, Peca.RAINHA, new Posicao(7, 5)));
        partida.adicionaLance(new Lance(17, a, Peca.CAVALO, new Posicao(6, 5)));
        partida.adicionaLance(new Lance(18, b, Peca.PEAO, new Posicao(3, 6)));
        partida.adicionaLance(new Lance(19, a, Peca.PEAO, new Posicao(7, 4)));
        partida.adicionaLance(new Lance(20, b, Peca.CAVALO, new Posicao(6, 6)));
        partida.adicionaLance(new Lance(21, a, Peca.TORRE, new Posicao(7, 1)));
        partida.adicionaLance(new Lance(22, b, Peca.PEAO, new Posicao(2, 5)));
        partida.adicionaLance(new Lance(23, a, Peca.PEAO, new Posicao(8, 4)));
        partida.adicionaLance(new Lance(24, b, Peca.RAINHA, new Posicao(7, 6)));
        partida.adicionaLance(new Lance(25, a, Peca.PEAO, new Posicao(8, 5)));
        partida.adicionaLance(new Lance(26, b, Peca.RAINHA, new Posicao(7, 5)));
        partida.adicionaLance(new Lance(27, a, Peca.RAINHA, new Posicao(6, 3)));
        partida.adicionaLance(new Lance(28, b, Peca.CAVALO, new Posicao(7, 8)));
        partida.adicionaLance(new Lance(29, a, Peca.BISPO, new Posicao(6, 4)));
        partida.adicionaLance(new Lance(30, b, Peca.RAINHA, new Posicao(6, 6)));
        partida.adicionaLance(new Lance(31, a, Peca.CAVALO, new Posicao(3, 3)));
        partida.adicionaLance(new Lance(32, b, Peca.BISPO, new Posicao(3, 5)));
        partida.adicionaLance(new Lance(33, a, Peca.CAVALO, new Posicao(4, 5)));
        partida.adicionaLance(new Lance(34, b, Peca.RAINHA, new Posicao(2, 2)));
        partida.adicionaLance(new Lance(35, a, Peca.BISPO, new Posicao(4, 6)));
        partida.adicionaLance(new Lance(36, b, Peca.BISPO, new Posicao(7, 1)));
        partida.adicionaLance(new Lance(37, a, Peca.PEAO, new Posicao(5, 5)));
        partida.adicionaLance(new Lance(38, b, Peca.RAINHA, new Posicao(1, 1)));
        partida.adicionaLance(new Lance(39, a, Peca.REI, new Posicao(5, 2)));
        partida.adicionaLance(new Lance(40, b, Peca.CAVALO, new Posicao(1, 6)));
        partida.adicionaLance(new Lance(41, a, Peca.CAVALO, new Posicao(7, 7)));
        partida.adicionaLance(new Lance(42, b, Peca.REI, new Posicao(4, 8)));
        partida.adicionaLance(new Lance(43, a, Peca.RAINHA, new Posicao(6, 6)));
        partida.adicionaLance(new Lance(44, b, Peca.CAVALO, new Posicao(6, 6)));
        partida.adicionaLance(new Lance(45, a, Peca.BISPO, new Posicao(5, 7)));

        System.out.println(partida);
    }
}
