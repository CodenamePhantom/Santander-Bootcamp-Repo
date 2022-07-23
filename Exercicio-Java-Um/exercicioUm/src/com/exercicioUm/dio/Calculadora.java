package com.exercicioUm.dio;

public class Calculadora {
    public static void calculadora(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        if (a != 0 || b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Divisão com zero não pode :(");
        }
    }
}
