package com.github.jntlvr.t22;

import java.util.List;

public class Parque {
	private Calendario calendario;
	private Diretor diretor;
	private List<Funcionario> funcionarios;

	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
}