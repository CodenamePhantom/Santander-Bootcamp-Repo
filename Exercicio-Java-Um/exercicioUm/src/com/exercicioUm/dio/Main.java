package com.exercicioUm.dio;

import java.util.Scanner;

import static com.exercicioUm.dio.Calculadora.calculadora;

public class Main {
    public static void main() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.print("Digite o primeiro numero: ");
        int firstNumber = Integer.parseInt(userInput.next());
        System.out.print("Digite o segundo numero: ");
        int secondNumber = Integer.parseInt(userInput.next());
        calculadora(firstNumber, secondNumber);
    }
}
