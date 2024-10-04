package ficha3;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do
        //seu somatório. (Não necessita de Scanner ou input do utilizador)

        int contador=1, soma=0;

        while (contador<=100){
            System.out.println(" "+contador + " dá");
            soma = soma+contador;
            System.out.println("Este número " + soma +  " com ");
            contador++;


        }
    }
}

