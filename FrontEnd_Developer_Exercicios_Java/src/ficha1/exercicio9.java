package ficha1;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Foi contactado pela empresa "XPTO, Lda." para a elaboração de um programa que permita calcular o vencimento
        //de um colaborador, bem como os descontos e impostos decorrentes desse processamento salarial. Conceitos:
        //a. Vencimento base: 40€/dia.
        //b. Subsídio de alimentação: 5€/dia.
        //c. Retenção de IRS: 10%.
        //d. Segurança Social: 11% encargo do funcionário e 23,75% encargo da entidade patronal.
        // Deve ser solicitado ao utilizador o código do funcionário, e o número de dias que ele trabalhou nesse mês.
        // Deverá depois apresentar:
        //a. o valor ilíquido a receber fruto do vencimento.
        //b. total subsídio de alimentação.
        //c. valor da retenção de IRS a entregar ao estado.
        //d. valor total a entregar à Segurança Social (ambos os encargos).
        //e. valor líquido a receber pelo funcionário.

        double vencimentoBase, subsAli, retencaoIRS, segurancaSocialFunc, segurancaSocialPatr, codFunc, numDiasTr;

        vencimentoBase = 40;
        subsAli = 5;
        retencaoIRS = vencimentoBase/0.1;
        segurancaSocialFunc = vencimentoBase/0.11;

        System.out.println("Insira o seu código de Funcionário: ");
        codFunc = input.nextDouble();

        System.out.println("Insira quantos dias de trabalho efetuou: ");
        numDiasTr = input.nextDouble();

        System.out.println("a " + (vencimentoBase * numDiasTr));
        System.out.println("b " + (numDiasTr * subsAli));
        System.out.println("c " + ((numDiasTr*vencimentoBase) / retencaoIRS));
        System.out.println("d ");
        System.out.println( "e " + numDiasTr * retencaoIRS);



    }

}

