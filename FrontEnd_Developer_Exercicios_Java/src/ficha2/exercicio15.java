package ficha2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Escreva um programa que leia 3 números, seguidamente deve perguntar ao utilizador se quer ordem crescente
        //‘C’ ou decrescente ‘D’, e deve colocar os números no ecrã por ordem decrescente ou crescente de acordo com a
        //escolha.

        int num1, num2, num3;
        String menu;

        System.out.println("Introduza o primeiro numero:");
        num1 = input.nextInt();

        System.out.println("Introduza o segundo numero: ");
        num2 = input.nextInt();

        System.out.println("Introduza o terceiro numero: ");
        num3 = input.nextInt();

        System.out.println("Quer em ordem crescente ou decrescente? ");
        menu = input.next().toLowerCase();

        switch (menu) {

            case "c":

                if (num1 < num2 && num2 < num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                }
                if (num1 < num3 && num3 < num2) {
                    System.out.println(num1 + " " + num3 + " " + num2);
                }
                if (num2 < num1 && num1 < num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                }
                if (num2 < num3 && num3 < num1) {
                    System.out.println(num2 + " " + num3 + " " + num1);
                }
                if (num3 < num1 && num1 < num2) {
                    System.out.println(num3 + " " + num1 + " " + num2);
                }
                if (num3 < num2 && num2 < num1) {
                    System.out.println(num3 + " " + num2 + " " + num1);
                    break;

                }
            case "d":
                if (num1 > num2 && num2 > num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                }
                if (num1 > num3 && num3 > num2) {
                    System.out.println(num1 + " " + num3 + " " + num2);
                }
                if (num2 > num1 && num1 > num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                }
                if (num2 > num3 && num3 > num1) {
                    System.out.println(num2 + " " + num3 + " " + num1);
                }
                if (num3 > num1 && num1 > num2) {
                    System.out.println(num3 + " " + num1 + " " + num2);
                }
                if (num3 > num2 && num2 > num1) {
                    System.out.println(num3 + " " + num2 + " " + num1);
                    break;


                }

        }
    }
}
