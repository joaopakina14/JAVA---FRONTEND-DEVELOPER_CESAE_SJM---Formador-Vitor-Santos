package ficha2;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Implemente um programa que, após pedir ao utilizador o saldo da conta bancária e montante a creditar/debitar
        //(montante positivo ou negativo, respetivamente), apresente se a operação é válida, ou seja, se o saldo final se
        //mantém positivo depois da operação. Finalmente, mostre o novo saldo.

        int saldo, movimento, saldoAtual;

        System.out.println("Introduza o seu Saldo Atual: ");
        saldo = input.nextInt();

        System.out.println("Introduza o movimento desejado: ");
        movimento = input.nextInt();

        if (saldo + movimento<0){;
            System.out.println("O seu saldo é negativo");

        }
        if (saldo + movimento>0){
            System.out.println("O seu saldo é:"+(saldo+movimento));
        }
    }
}
