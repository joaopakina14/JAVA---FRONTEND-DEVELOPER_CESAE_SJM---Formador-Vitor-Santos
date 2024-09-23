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

        int valorInicial, valor, nota200=200, quociente, resto, nota100=100, nota50=50;


        System.out.println("Introduza o valor pretendido: ");
        valorInicial = input.nextInt();

        quociente = 250/200;
        resto = 250%200;

        System.out.println(quociente);
        System.out.println(resto);

        valor=valorInicial/nota200;


        System.out.println(valor + " notas de 200");

        System.out.println();


        }


}


