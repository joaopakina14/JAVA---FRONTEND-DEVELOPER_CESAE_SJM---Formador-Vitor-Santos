package ficha1;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        //Habilitar a escrita do user

        Scanner input = new Scanner(System.in);

        //Escreva um programa que requisite dois valores. O programa deverá utilizá-los como operandos para
        //as seguintes operações aritméticas: soma, subtração, multiplicação e divisão. Apresente o resultado
        //das operações e teste os resultados obtidos com vários casos.

        int num1, num2, soma, subtraçao, multiplicaçao, divisao;

        //ler numero 1
        System.out.println("Introduza o primeiro número: ");
        num1= input.nextInt();

        //ler numero 2
        System.out.println("Introduza o segundo número: ");
        num2=input.nextInt();

        //Calcular a soma
        soma=num1+num2;

        //apresentar a soma
        System.out.println("Resultado da soma: "+soma);

        //calcular a subtração
        subtraçao=num1-num2;

        //apresentar a subtração
        System.out.println("Resultado da subtração: "+subtraçao);

        //calcular a multiplicação
        multiplicaçao=num1*num2;

        //apresentar a multiplicação
        System.out.println("Resultado da multiplicação: "+multiplicaçao);

        //calcular a divisão
        divisao=num1/num2;

        //apresentar a divisão
        System.out.println("Resultado da divisão: "+divisao);

    }
}
