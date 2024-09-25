package ficha3;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Faça um algoritmo que leia dois números inteiros, representando os valores início e fim de um intervalo e
        //imprima os múltiplos de 5 entre eles.

        int num1, num2;

        System.out.println("Imprima o primeiro valor: ");
        num1 = input.nextInt();

        System.out.println("Imprima o segundo valor: ");
        num2 = input.nextInt();



        while(num1<=num2){
            if(num1%5==0){
                System.out.println(num1);

            }
            num1++;

        }


    }
}
