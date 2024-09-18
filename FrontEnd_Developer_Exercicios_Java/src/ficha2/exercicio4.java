package ficha2;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Na fórmula 1, os pontos no final de cada corrida são atribuidos da seguinte forma:
        //a. 1º Lugar: 10 pontos
        //b. 2º Lugar: 8 pontos
        //c. 3º Lugar: 6 pontos
        //d. 4º Lugar: 5 pontos
        //e. 5º Lugar: 4 pontos
        //f. 6º Lugar: 3 pontos
        //g. 7º Lugar: 2 pontos
        //h. 8º Lugar: 1 ponto
        //Escreva um programa que leia o lugar em que o piloto terminou e escreva quantos pontos ganhou

        int posicao, pontos;

        System.out.println("Introduza a posição: ");
        posicao = input.nextInt();

        if (posicao == 1) {
            // 1º lugar da posição
            pontos = posicao + 9;
            System.out.println("Pontos: " + pontos);
        }

        if (posicao == 2) {
            // 2º lugar da posição
            pontos = posicao + 6;
            System.out.println("Pontos: " + pontos);

        }
        if (posicao == 3) {
            // 3º lugar da posição
            pontos = posicao + 3;
            System.out.println("Pontos: " + pontos);
        }
        if (posicao == 4) {
            // 4º lugar da posição
            pontos = posicao + 1;
            System.out.println("Pontos: " + pontos);

        }
        if (posicao == 5) {
            // 5º lugar da posição
            pontos = posicao - 1;
            System.out.println("Pontos: " + pontos);
        }
        if (posicao == 6) {
            // 6º lugar da posição
            pontos = posicao - 3;
            System.out.println("Pontos: " + pontos);

        }
        if (posicao == 7) {
            // 7º lugar da posição
            pontos = posicao - 5;
            System.out.println("Pontos: " + pontos);
        }
        if (posicao == 8) {
            // 8º lugar da posição
            pontos = posicao - 7;
            System.out.println("Pontos: " + pontos);

        }
        if (posicao > 8) {
            // acima da 8ª posição
            pontos = posicao * 0;
            System.out.println("Não Ganhou Pontos: " + pontos);
        }
    }
}