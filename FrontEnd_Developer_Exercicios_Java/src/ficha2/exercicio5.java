package ficha2;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia dois valores numéricos e apresente o menor e depois o maior.

        double num1, num2;

        System.out.print("Insira o numero 1: ");
        num1 = input.nextDouble();

        System.out.print("Insira o numero 2: ");
        num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("Apresenta-se primeiro o numero 1: " + num1 + " E depois o numero 2: " + num2);
        }
        if (num1 < num2) {
            System.out.println("Apresenta-se primeiro o numero 2: " + num2 + " E depois o numero 1: " + num1);
        }

    }
}
