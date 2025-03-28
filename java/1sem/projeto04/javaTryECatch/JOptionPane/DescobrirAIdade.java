// 2. Monte um programa que peça para o usuário digitar o ano atual e o
//ano de seu nascimento exiba ao final a idade deste usuário.

package javaTryECatch.JOptionPane;

import javax.swing.JOptionPane;

public class DescobrirAIdade {
    public static void main(String[] args) {
        int anoAtual, anoQueVoceNasceu, idade;
        String auxiliar;

        try {
            // Ano atual
            auxiliar = JOptionPane.showInputDialog("Digite o ano atual: ");
            anoAtual = Integer.parseInt(auxiliar);

            // Ano que o usuário nasceu
            auxiliar = JOptionPane.showInputDialog("Digite o ano que você naseceu: ");
            anoQueVoceNasceu = Integer.parseInt(auxiliar);

            // Calculando para descobrir a idade
            idade = anoAtual - anoQueVoceNasceu;
            JOptionPane.showMessageDialog( null,
                "A sua idade é: " + idade
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null,
                "Erro: Digite um ano valido!"
            );
        }
    }
}
