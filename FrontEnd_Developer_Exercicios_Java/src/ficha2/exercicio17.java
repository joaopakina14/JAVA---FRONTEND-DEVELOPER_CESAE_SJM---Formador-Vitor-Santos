package ficha2;

import java.util.Scanner;

public class exercicio17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Um banco autoriza a conceção de um crédito especial aos seus clientes, num montante variável com base no seu
        //saldo médio do último ano. Faça um programa que leia o saldo médio de um cliente e calcule o valor do crédito
        //especial de acordo com a seguinte tabela. Mostre uma mensagem com o saldo médio e o valor de crédito.

        //Saldo Médio                                Percentagem
        //De 0 a 2000 (inclusive)                    Nenhum crédito
        //De 2000 a 4000 (inclusive)                 20% do valor do saldo médio
        //De 4000 a 6000 (inclusive)                 30% do valor do saldo médio
        //Acima de 6000                              40% do valor do saldo médio

        int saldoMedioAnual, creditoEspecial;

        System.out.println("Introduza o Saldo Médio Anual do Cliente: ");
        saldoMedioAnual = input.nextInt();

        if (saldoMedioAnual>0 && saldoMedioAnual <=2000){
            System.out.println("O cliente não tem direito ao Crédito Especial.");
        }
        if (saldoMedioAnual>2000 && saldoMedioAnual <=4000){
            System.out.println("O cliente tem direito a " + saldoMedioAnual*0.2 + " € de Crédito Especial");
        }
        if (saldoMedioAnual>4000 && saldoMedioAnual <=6000){
            System.out.println("O cliente tem direito a " + saldoMedioAnual*0.3 + " € de Crédito Especial");
        }

        if (saldoMedioAnual>6000){
            System.out.println("O cliente tem direito a " + saldoMedioAnual*0.4 + " € de Crédito Especial");
        }




    }
}
