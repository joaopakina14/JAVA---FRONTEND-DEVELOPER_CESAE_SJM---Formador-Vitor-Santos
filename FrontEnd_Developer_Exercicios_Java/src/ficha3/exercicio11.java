package ficha3;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto) e imprima os
        //números inteiros de 0 até limite inclusive, com incremento de salto. Suponha que limite e salto são maiores que
        //zero. Exemplo:
        //Valores lidos: 10 (limite) e 3 (salto)
        //Saída do algoritmo: 0 3 6 9

        int contador=0, num, salto=0;

        System.out.println("Introduza o valor pretendido: ");
        num = input.nextInt();

        System.out.println("Introduza o salto pretendido: ");
        salto = input.nextInt();

        while (contador<num){
            contador = contador + salto;
            System.out.println(contador);
        }
    }
}
