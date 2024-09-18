package ficha2;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia três notas (0-20 valores) de um aluno, calcule a sua média final ponderada, e diga
        //se está aprovado ou não (mais de 9.5). Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3:40%

        double nota1, nota2, nota3, mediaponderada;

                System.out.println("Introduza a nota 1: ");
                nota1=input.nextDouble();

                System.out.println("Introduza a nota 2: ");
                nota2=input.nextDouble();

                System.out.println("Introduza a nota 3: ");
                nota3=input.nextDouble();

                mediaponderada = (nota1*0.25) + (nota2*0.35) + (nota3*0.40);

                if (mediaponderada > 9.5) {
                    System.out.println("Está Aprovado!");
                }else{
                        System.out.println("Está reprovado!");
                    }
                }




    }
