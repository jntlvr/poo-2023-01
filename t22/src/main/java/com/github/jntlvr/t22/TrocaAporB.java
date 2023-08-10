package com.github.jntlvr.t22;

import java.time.LocalDate;
import java.time.LocalTime;

public class TrocaAporB {
	private Bilhete bilheteA;
	private Bilhete bilheteB;
	private CentroDeVendas centrodeVenda;
	private LocalDate dataCompra;
	private LocalTime horaCompra;
	private double diferencaValor;
	public void atualizarDataHoraTroca(LocalDate novaData, LocalTime novaHora) {
		this.dataCompra = novaData;
		this.horaCompra = novaHora;
	}
	public void TrocaAporB(Bilhete bilheteA, Bilhete bilheteB) {
		this.bilheteA = bilheteB;
	}
}