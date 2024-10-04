package ficha3;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n. Utilize o ciclo
        //while.
        //Exemplo de Fatorial de 5: 5x4x3x2x1=120
        //Exemplo de Fatorial de 8: 8x7x6x5x4x3x2x1=40320

        int contador=1, num, fatorial=1;

        System.out.println("Introduza um algarismo: ");
        num= input.nextInt();

        while (contador<=num){
            fatorial=fatorial * contador;
            contador++;


        }
        System.out.println(num + fatorial);



    }
}
