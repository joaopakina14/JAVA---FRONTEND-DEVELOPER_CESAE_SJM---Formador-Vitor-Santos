package ficha2;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int num1, num2;

    //ler num1
        System.out.print("Introduza o primeiro número: ");
        num1 = input.nextInt();

    //ler num2
        System.out.print("Introduza o segundo número: ");
        num2 = input.nextInt();

    if (num1>num2){
        System.out.println("Maior: "+num1);
    }else{
        System.out.println("Maior: "+num2);
    }










    }
}
