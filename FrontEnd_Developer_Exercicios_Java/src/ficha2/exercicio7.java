package ficha2;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia um número, depois apresente se é par ou ímpar

        int num;

        System.out.println("Insira o numero: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par!");
        } else {

            System.out.println("O número é impar");

        }
    }
}


