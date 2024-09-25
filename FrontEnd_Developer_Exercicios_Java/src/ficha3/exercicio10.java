package ficha3;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
        //Suponha que o número lido da entrada será maior que 2

        int contador=0, num;

        System.out.println("Introduza o valor pretendido: ");
        num = input.nextInt();

        while (contador<num){
            System.out.println(contador+=2);
        }

    }

}
