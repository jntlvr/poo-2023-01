package com.github.jntlvr.t22;

import java.time.LocalTime;
import java.util.Date;

public class Bilhete {
    private TipoBilhete tipo;
    private TrocaAporB troca;
    private Venda venda;
    private Date dataCompra;
    private LocalTime horaCompra;

    public TipoBilhete getTipoBilhete() {
        return tipo;
    }
}
