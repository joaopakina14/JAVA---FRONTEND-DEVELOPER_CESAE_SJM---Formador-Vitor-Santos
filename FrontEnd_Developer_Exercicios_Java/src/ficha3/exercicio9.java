package ficha3;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1. O computador
        //deve dizer a média dos números introduzidos (excluindo o -1).

        int contador=-1, num1=0, soma=0;
        double media;


        while (num1 != -1){
            soma += num1;
            contador ++;
            System.out.println("Introduza um valor: ");
            num1 = input.nextInt();

        }

        System.out.println(soma);
        System.out.println(contador);
        media = soma/contador;
        System.out.println("media dos valores é: " +media);
    }
}
