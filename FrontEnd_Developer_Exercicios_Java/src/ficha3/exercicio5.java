package ficha3;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


    //Faça um programa que leia um número inteiro e, de seguida, leia uma mensagem. Depois imprima a mensagem
    //x vezes, sendo x o número inteiro lido.

    int contador=0,numint;

        System.out.println("Introduza o número de vezes que deseja ver esta Mensagem: ");
        numint= input.nextInt();

        while (contador<numint){
            System.out.println("Não percebo nada de programação");
            contador++;
        }



    }

}
