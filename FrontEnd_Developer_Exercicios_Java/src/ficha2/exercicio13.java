package ficha2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.

        int horas, horasAm, minutos;

        //Inserir as horas
        System.out.println("Introduza as horas: ");
        horas = input.nextInt();

        System.out.println("Introduza os minutos: ");
        minutos = input.nextInt();

        if (horas>0 && horas<13) {
            System.out.println("São " + horas + " horas");
            System.out.println("E " + minutos + " minutos.");
        }

        if (horas == 13) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
        if (horas == 14) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
        if (horas == 15) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
        if (horas == 16) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
        if (horas == 17) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
        if (horas == 18) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
        if (horas == 19) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
        if (horas == 20) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
        if (horas == 21) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
        if (horas == 22) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
        if (horas == 23) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
        if (horas == 24) {
            ;
            horasAm = horas - 12;
            System.out.println("São: " + horasAm + " hora");

            System.out.println("E " + minutos + " minutos.");

        }
    }
}