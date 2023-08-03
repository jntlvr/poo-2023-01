package com.github.jntlvr.t13;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, soma, subtracao, multiplicacao, divisao;

        System.out.println("Digite o primeiro numero:");
        numero1= entrada.nextDouble();

        System.out.println("Digite o segundo numero:");
        numero2= entrada.nextDouble();

        soma=numero1+numero2;
        subtracao=numero1-numero2;
        multiplicacao=numero1*numero2;
        divisao=numero1/numero2;

        System.out.println("Soma: " +soma);
        System.out.println("Subtracao: " +subtracao);
        System.out.println("Multiplicacao: " +multiplicacao);
        System.out.println("Divisao: " +divisao);

    }
}