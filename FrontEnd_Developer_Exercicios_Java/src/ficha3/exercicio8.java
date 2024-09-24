package ficha3;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.
        //a. Por exemplo: Leu 15, deve imprimir: 10 11 12 13 14 16 17 18 19 20

        int contador=0, num1, numLess5, numPlus5;

        System.out.println("Introduza o seu número: ");
        num1= input.nextInt();

        numLess5=num1-5;
        numPlus5=num1+5;

        while (numLess5<=numPlus5) {
            ;
            System.out.println(numLess5);
            numLess5 = numLess5 + 1;
        }

    }
}
