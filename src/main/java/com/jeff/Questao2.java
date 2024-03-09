package com.jeff;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = entrada.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int num) {
        int anterior = 0, atual = 1, proximo = 0;

        while (proximo < num) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return proximo == num;
    }

}
