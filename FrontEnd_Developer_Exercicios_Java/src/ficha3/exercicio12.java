package ficha3;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecidos pelo
        //utilizador e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100]. A entrada de
        //dados deve terminar quando for lido um número negativo



        // Inicializando contadores para os intervalos
        int cont0_25 = 0;
        int cont26_50 = 0;
        int cont51_75 = 0;
        int cont76_100 = 0;
        int cont101 = 0;

        int numero = 0;

        // Loop que continua enquanto o número for positivo
        while (numero >= 0) {
            System.out.print("Digite um número (negativo para terminar): ");
            numero = input.nextInt();

            if (numero >= 0 && numero <= 25) {
                cont0_25++;
            } else if (numero >= 26 && numero <= 50) {
                cont26_50++;
            } else if (numero >= 51 && numero <= 75) {
                cont51_75++;
            } else if (numero >= 76 && numero <= 100) {
                cont76_100++;
            } else if (numero > 100) {
                cont101++;
            }
        }

        // Exibindo os resultados
        System.out.println("Números no intervalo [0,25]: " + cont0_25);
        System.out.println("Números no intervalo [26,50]: " + cont26_50);
        System.out.println("Números no intervalo [51,75]: " + cont51_75);
        System.out.println("Números no intervalo [76,100]: " + cont76_100);
        System.out.println("Números fora do intervalo pretendido: " + cont101);

        input.close();
    }
}
