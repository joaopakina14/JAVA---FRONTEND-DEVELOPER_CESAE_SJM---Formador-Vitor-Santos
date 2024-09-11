package ficha1;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa para calcular a área da circunferência. As dimensões devem ser requisitadas ao
        //utilizador.

        //Criação das variáveis
        double pi, raio,circunf;

        //atribuir o valor de pi
        pi=3.14;

        //User Introduz o valor do raio
        System.out.println("Introduza o valor do raio: ");
        raio=input.nextDouble();

        //calcular a area da circunferencia
        circunf=pi*(raio*raio);

        System.out.println("Area da circunferencia: "+circunf);









    }
}
