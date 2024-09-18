package ficha1;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia dois valores inteiros e os armazene na variáveis valor1 e valor2. Permute
        //o valor das variáveis e apresente o resultado. De seguida, verifique se consegue efetuar esta troca sem
        //criar variáveis adicionais

        int num1, num2;

        System.out.println("Introduza o numero1: ");
        num1=input.nextInt();

        System.out.println("Introduza o numero2: ");
        num2=input.nextInt();

        // Permutação sem usar variável adicional
        num1 = num1 + num2; // Somamos os dois números
        num2 = num1 - num2; // Agora num2 recebe o valor de num1
        num1 = num1 - num2; // E num1 recebe o valor de num2


        System.out.println("Após a troca, o valor 1 é: "+num1);
        System.out.println("Após a troca, o valor 2 é: "+ num2);






    }
}
