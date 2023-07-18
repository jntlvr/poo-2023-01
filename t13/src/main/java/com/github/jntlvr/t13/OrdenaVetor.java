package com.github.jntlvr.t13;
import java.util.Arrays;
public class OrdenaVetor {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 8, 1, 9, 3};

        System.out.println("Vetor original: " + Arrays.toString(vetor));

        Arrays.sort(vetor);

        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }
}
