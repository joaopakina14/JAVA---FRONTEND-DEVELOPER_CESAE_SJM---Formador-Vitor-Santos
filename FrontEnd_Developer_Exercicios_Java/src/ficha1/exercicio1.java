package ficha;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        // Leia dois números inteiros e escreva na consola o maior deles.

        //Habilitar a escrita do user

        Scanner input = new Scanner(System.in);

        //Declarar as variáveis

        int num1, num2, soma;

        //ler num1
        System.out.print("Introduza o primeiro número: ");
        num1 = input.nextInt();

        //ler num2
        System.out.print("Introduza o segundo número: ");
        num2 = input.nextInt();

        //Calcular a soma
        soma=num1 + num2;

        //apresentar a soma
        System.out.print("Resultado: " + soma);
    }

}
