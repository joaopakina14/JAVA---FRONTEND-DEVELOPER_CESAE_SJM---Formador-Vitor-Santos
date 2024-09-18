package ficha2;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Implemente um programa de menu (opções do menu: 1. Criar 2. Atualizar 3. Eliminar 4. Sair). Se uma das opções
        //1, 2 ou 3 for escolhida, imprima na tela a opção selecionada, se for a 4 não deve fazer nada. Caso a opção for
        //inválida, deve informar o utilizador.

        int menu, criar, atualizar, eliminar, sair;
        String menu1 = "Erro";



        System.out.println("Introduza:\n1 para Criar\n2 para Atualizar\n3 para Eliminar\n4 para Sair.");
        menu = input.nextInt();

        switch (menu){

            case 1:
                System.out.println("Criar");
                break;
            case 2:
                System.out.println("Atualizar");
                break;
            case 3:
                System.out.println("Eliminar");
                break;
            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Erro");

        }




    }
}
