package com.jeff;

import java.util.Scanner;

public class ExecutarTodasAsQuestoes {

    public static void main(String[] args) {
        System.out.println("----------- Q2 -----------");
        executarQuestao2();

        System.out.println();
        System.out.println("----------- Q5 -----------");
        executarQuestao3();
    }

    public static void executarQuestao2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- Verificar se número existe na sequência fibonacci");
        System.out.print("Informe um número: ");
        int numero = entrada.nextInt();

        if (Questao2.pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static void executarQuestao3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Inverter texto");
        System.out.print("Informe uma string: ");
        String textoNormal = scanner.nextLine();

        String textoInvertido = Questao5.inverterString(textoNormal);
        System.out.println("String invertida: " + textoInvertido);
    }
}