package ficha3;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.

        int cont=0, num;

        System.out.println("Introduza um numero inteiro: ");
        num= input.nextInt();

        while(cont<=num){
            System.out.println(cont);
            cont++;

        }



    }
}
