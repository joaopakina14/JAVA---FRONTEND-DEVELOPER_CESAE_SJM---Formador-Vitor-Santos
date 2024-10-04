package ficha3;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia uma sequência de números inteiros do utilizador e determine se a sequência
        //está em ordem crescente.

        int contador=0, quantAlgarismos, numero, numAnt, numAtual;

        //ler quantidade

        System.out.println("quantos números deseja inserir: ");
        quantAlgarismos= input.nextInt();

        while(contador<quantAlgarismos){
            System.out.println("insira um numero: ");
            numero= input.nextInt();

            contador++;
        }


        }

    }

