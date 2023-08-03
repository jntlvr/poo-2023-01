package com.github.jntlvr.t13;

import java.util.Scanner;

public class Identidade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome=entrada.nextLine();

        System.out.println("Digite sua idade: ");
        idade=entrada.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
    }
}
