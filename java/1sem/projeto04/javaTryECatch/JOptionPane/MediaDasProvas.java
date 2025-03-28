// 1. Monte um programa que peça para o usuário digitar as notas das 4
// provas (prova1, prova2, prova3 e prova4) e exiba a média aritmética
// simples.

package javaTryECatch.JOptionPane;

import javax.swing.JOptionPane;

public class MediaDasProvas {
    public static void main(String[] args) {
        float prova1, prova2, prova3, prova4, nota;
        String auxiliar;

        try {
            // Recebendo valor da primeira prova
            auxiliar = JOptionPane.showInputDialog("Digite a primeira nota da prova: ");
            prova1 = Float.parseFloat(auxiliar);

            // Recebendo valor da primeira prova
            auxiliar = JOptionPane.showInputDialog("Digite a segunda nota da prova: ");
            prova2 = Float.parseFloat(auxiliar);

            // Recebendo valor da primeira prova
            auxiliar = JOptionPane.showInputDialog("Digite a terceira nota da prova: ");
            prova3 = Float.parseFloat(auxiliar);

            // Recebendo valor da primeira prova
            auxiliar = JOptionPane.showInputDialog("Digite a quarta nota da prova: ");
            prova4 = Float.parseFloat(auxiliar);

            // Calculando a média das provas
            nota = (prova1 + prova2 + prova3 + prova4) / 4;
            JOptionPane.showMessageDialog( null,
                "A sua nota é: " + nota
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null,
                "Erro: Digite uma nota de 0 a 10"
            );
        }
    }
}
