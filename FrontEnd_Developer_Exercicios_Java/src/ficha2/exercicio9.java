package ficha2;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Crie um programa que mostre o menor de três números inteiros lidos.

        int num1, num2, num3;

        System.out.println("Introduza o primeiro numero: ");
        num1 = input.nextInt();

        System.out.println("Introduza o segundo numero: ");
        num2 = input.nextInt();

        System.out.println("Introduza o terceiro numero: ");
        num3 = input.nextInt();

        if (num1<num2 && num1<num3){
            System.out.println("O menor numero é o: "+num1);

        }
        if (num2<num1 && num2<num3){
            System.out.println("O menor numero é o: "+num2);
        }
        if (num3<num1 && num3<num2){
            System.out.println("O menor numero é o: "+num3);
        }
    }
}
