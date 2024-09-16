package ficha1;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos. Apresente o valor
        //a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produto.

        double preco1, preco2, preco3, preco1desc, preco2desc, preco3desc, precofinal1, precofinal2, precofinal3;

        System.out.println("Introduza o 1ºPreço: ");
        preco1=input.nextDouble();

        System.out.println("Introduza o 2ºpreço: ");
        preco2=input.nextDouble();

        System.out.println("Introduza o 3ºpreço: ");
        preco3=input.nextDouble();

        System.out.println(" ");


        preco1desc = preco1* 0.1;
        preco2desc = preco2* 0.1;
        preco3desc = preco3* 0.1;

        precofinal1 = preco1-preco1desc;
        precofinal2 = preco2-preco2desc;
        precofinal3 = preco3-preco3desc;

        System.out.println("Valor dos descontos: ");
        System.out.println("O valor a ser descontado do primeiro valor é de: "+preco1desc);
        System.out.println("O valor a ser descontado do segundo valor é de: "+preco2desc);
        System.out.println("O valor a ser descontado do terceiro valor é de: "+preco3desc);

        System.out.println(" ");

        System.out.println("Preços finais: ");
        System.out.println("O preço final do primeiro valor será: "+(preco1-preco1desc));
        System.out.println("O preço final do segundo valor será: "+(preco2-preco2desc));
        System.out.println("O preço final do terceiro valor será: "+(preco3-preco3desc));

        System.out.println(" ");

        System.out.println("Valor total: ");
        System.out.println("O valor total a pagar será: "+(precofinal1+precofinal2+precofinal3));

    }
}
