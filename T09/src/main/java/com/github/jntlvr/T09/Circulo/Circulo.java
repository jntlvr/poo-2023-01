package com.github.jntlvr.T09.Circulo;

public class Circulo {
    double raio;
    Ponto centro;

    public void Transladar(double dx, double dy) {
        this.centro.X = dx;
        this.centro.Y = dy;
    }
}

