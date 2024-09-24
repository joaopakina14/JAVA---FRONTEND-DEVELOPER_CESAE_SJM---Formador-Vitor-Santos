package ficha2;

import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Escreva um programa que lê um valor em euros (múltiplo de 5) e calcula qual o menor número possível de notas
        //de 200, 100, 50, 20, 10, 5 em que o valor pode ser decomposto. Escrever o valor lido e a relação de notas
        //necessárias.

        //if variavel %5 == 0
        //Se for 530 por exemplo o menor numero possivel será 10€,
        // porque é a nota mais pequena que temos de ter para fazer 530€

        int valor, notas;

        System.out.println("Insira o valor em €: ");
        valor= input.nextInt();

        //tentar dar notas de 200
        notas = valor/200;
        System.out.println(notas + " notas de 200");
        valor= valor % 200;


        //tentar dar notas de 100
        notas = valor/100;
        System.out.println(notas + " notas de 100");
        valor= valor % 100;

        //tentar dar notas de 50
        notas = valor/50;
        System.out.println(notas + " notas de 50");
        valor= valor % 50;

        //tentar dar notas de 20
        notas = valor/20;
        System.out.println(notas + " notas de 20");
        valor= valor % 20;

        //tentar dar notas de 10
        notas = valor/10;
        System.out.println(notas + " notas de 10");
        valor= valor % 10;

        //tentar dar notas de 5
        notas = valor/5;
        System.out.println(notas + " notas de 5");
        valor= valor % 5;









        }


}


