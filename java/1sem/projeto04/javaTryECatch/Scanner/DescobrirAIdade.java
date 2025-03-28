// 2. Monte um programa que peça para o usuário digitar o ano atual e o
// ano de seu nascimento exiba ao final a idade deste usuário.

package javaTryECatch.Scanner;

import java.util.Scanner;

public class DescobrirAIdade {
    public static void main(String[] args) {
        int anoAtual, anoQueVoceNasceu, idade;
        Scanner scan = new Scanner(System.in);

        try {
            // Ano atual
            System.out.println("Digite o ano atual: ");
            anoAtual = scan.nextInt();

            // Ano que o usuário nasceu
            System.out.println("Digite o ano que você nasceu: ");
            anoQueVoceNasceu = scan.nextInt();

            // Calculando para descobrir a idade
            idade = anoAtual - anoQueVoceNasceu;
            System.out.println("A sua idade é: " + idade);
        } catch (Exception e) {
            System.out.println("Erro: Digite um ano válido!");
        }
    }
}
