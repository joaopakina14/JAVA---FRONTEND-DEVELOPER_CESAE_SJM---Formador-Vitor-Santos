package ficha3;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        //Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e
        //imprima os números inteiros neste intervalo.

    int cont=0, num1, num2;

        System.out.println("Diga qual o seu primeiro número: ");
        num1= input.nextInt();

        System.out.println("Diga qual o seu segundo número: ");
        num2= input.nextInt();

        while (num1<=num2){
            System.out.println(num1);
            num1++;

        }


    }
}
