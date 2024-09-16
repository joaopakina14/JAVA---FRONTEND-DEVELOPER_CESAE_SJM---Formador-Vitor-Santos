package ficha1;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que determine a média aritmética de um conjunto de 3 valores introduzidos pelo
        //utilizador. Tendo em consideração os valores introduzidos, deverá também apresentar a média
        //ponderada considerando as seguintes ponderações: 20%, 30%, 50%.



        //criação das variáveis
        double valor1, valor2, valor3,pesoValor1, pesoValor2, pesoValor3, media;

        System.out.println("Introduza o primeiro valor: ");
        valor1=input.nextDouble();

        System.out.println("Introduza o segundo valor: ");
        valor2=input.nextDouble();

        System.out.println("Introduza o terceiro valor: ");
        valor3=input.nextDouble();

        pesoValor1=valor1*0.2;
        pesoValor2=valor2*0.3;
        pesoValor3=valor3*0.5;

        System.out.println("A media ponderada é: "+ (pesoValor1+pesoValor2+pesoValor3));





    }
}
