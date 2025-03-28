// 1. Monte um programa que peça para o usuário digitar as notas das 4
// provas (prova1, prova2, prova3 e prova4) e exiba a média aritmética
// simples.

package javaTryECatch.Scanner;

import java.util.Scanner;

public class MediaDasProvas {
    public static void main(String[] args) {
        float prova1, prova2, prova3, prova4, mediaDasNotas;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            // Recebendo valor da primeira prova
            System.out.println("Digite a nota da prova 1: ");
            prova1 = scan.nextFloat();

            // Recebendo valor da segunda prova
            System.out.println("Digite a nota da prova 2: ");
            prova2 = scan.nextFloat();

            // Recebendo valor da terceira prova
            System.out.println("Digite a nota da prova 3: ");
            prova3 = scan.nextFloat();

            // Recebendo valor da quarta prova
            System.out.println("Digite a nota da prova 4: ");
            prova4 = scan.nextFloat();

            // Calculando a média das provas
            mediaDasNotas = (prova1 + prova2 + prova3 + prova4) / 4;
            System.out.println("A sua nota é: " + mediaDasNotas);
        } catch (Exception e) {
            System.out.println("Digite um valor válido de 0 a 10");
        }
    }
}
