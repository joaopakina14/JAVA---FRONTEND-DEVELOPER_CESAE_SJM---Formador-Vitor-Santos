package ficha1;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que calcule e apresente a área e o perímetro de um retângulo. As dimensões
        //devem ser requisitadas ao utilizador.

        //Criação das variaveis
        double largura, comprimento, area, perimetro, lado1, lado2, lado3, lado4;

        //Insira a area para calculo da area
        System.out.println("Introduza a largura para calculo da area: ");
        largura = input.nextDouble();

        //insira o comprimento para calculo da area
        System.out.println("Insira o comprimento para calculo da area: ");
        comprimento = input.nextDouble();

        //calcular a area
        area=comprimento*largura;
        //apresentar a area
        System.out.println("Área: "+area);

        //insira comprimento do lado 1
        System.out.println("Insira comprimento do lado 1: ");
        lado1=input.nextDouble();

        //insisra o comprimento do lado 2
        System.out.println("Insira o comprimento do lado 2: ");
        lado2=input.nextDouble();

        //Insira comprimento do lado 3
        System.out.println("Insira comprimento do lado 3: ");
        lado3=input.nextDouble();

        //Insira comprimento do lado 4
        System.out.println("Insira comprimento do lado 4: ");
        lado4=input.nextDouble();

        perimetro=lado1+lado2+lado3+lado4;
        System.out.println("Perimetro: "+perimetro);






    }

}
