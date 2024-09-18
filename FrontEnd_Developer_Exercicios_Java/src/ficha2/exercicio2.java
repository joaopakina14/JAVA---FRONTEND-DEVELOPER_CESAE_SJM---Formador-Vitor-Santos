package ficha2;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
        //a. Salário até 15.000€ inclusive paga taxa de 20%
        //b. Salário superior a 15.000€ paga taxa de 30%

        // Declarar as Variáveis
        double salario, taxa;

        // Ler o salário
        System.out.print("Insira o salário anual: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            // Salário menor ou igual a 15.000
            taxa = salario * 0.2;
            System.out.println("Taxa de 20%: " + taxa);
        } else {
            // Salário maior que 15.000
            taxa = salario * 0.3;
            System.out.println("Taxa de 30%: " + taxa);

        }


    }
}