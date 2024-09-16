package ficha1;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Escreva um programa que calcule a duração (no formato hh:mm:ss) de um álbum musical com 5
        //canções. A duração de cada canção é lida em minutos e segundos.


        //Declarar as variáveis
        int segundosLidos=0 , minutosLidos, segundosTotaisDoAlbum=0, horas, minutos, segundos;

        System.out.println("Introduza os minutos da musica 1:" );
        minutosLidos = input.nextInt();

        System.out.println("Introduza os segundos da música 1:" );
        segundosLidos=input.nextInt();

        segundosTotaisDoAlbum=segundosTotaisDoAlbum +(minutosLidos*60)+ segundosLidos;

        System.out.println("Introduza os minutos da musica 2:" );
        minutosLidos = input.nextInt();

        System.out.println("Introduza os segundos da música 2:" );
        segundosLidos=input.nextInt();

        segundosTotaisDoAlbum=segundosTotaisDoAlbum +(minutosLidos*60)+segundosLidos;

        System.out.println("Introduza os minutos da musica 3:" );
        minutosLidos = input.nextInt();

        System.out.println("Introduza os segundos da música 3:" );
        segundosLidos=input.nextInt();

        segundosTotaisDoAlbum=segundosTotaisDoAlbum +(minutosLidos*60)+segundosLidos;

        System.out.println("Introduza os minutos da musica 4:" );
        minutosLidos = input.nextInt();

        System.out.println("Introduza os segundos da música 4:" );
        segundosLidos=input.nextInt();

        segundosTotaisDoAlbum=segundosTotaisDoAlbum +(minutosLidos*60)+segundosLidos;

        System.out.println("Introduza os minutos da musica 5:" );
        minutosLidos = input.nextInt();

        System.out.println("Introduza os segundos da música 5:" );
        segundosLidos=input.nextInt();

        segundosTotaisDoAlbum=segundosTotaisDoAlbum +(minutosLidos*60)+segundosLidos;

        System.out.println("Segundos Totais do Álbum: " + segundosTotaisDoAlbum);

        // Calcular as horas, minutos e segundos
        horas = segundosTotaisDoAlbum / 3600;
        minutos = (segundosTotaisDoAlbum / 60) - (horas * 60);
        segundos = segundosTotaisDoAlbum - (horas * 3600) - (minutos * 60);


        System.out.println(horas + "h " + minutos + "m " + segundos + "s");


    }
}
