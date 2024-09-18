package ficha2;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
        //realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
        //a soma, o utilizador deve escrever ‘+’). Se for inválido apresente erro.

        int num1, num2;
        String operacao;



        System.out.println("Introduza o primeiro numero: ");
        num1 = input.nextInt();

        System.out.println("Introduza o segundo numero: ");
        num2 = input.nextInt();

        System.out.println("Introduza o operação desejada: ");
        operacao = input.next();

        switch (operacao){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("Erro");

        }

    }
}
