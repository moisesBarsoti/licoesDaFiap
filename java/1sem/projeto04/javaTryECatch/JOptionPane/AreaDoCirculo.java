// 3. Monte um programa que peça para o usuário digitar o valor do raio
//de um círculo e exiba a área deste círculo (lembrete: área do círculo =
//PI * raio²)

package javaTryECatch.JOptionPane;

import javax.swing.*;

public class AreaDoCirculo {
    public static void main(String[] args) {
        float pI = 3.14f, valorDoRaio, areaDoCirculo;
        String auxiliar;

        try {
            // Recebendo o valor do raio
            auxiliar = JOptionPane.showInputDialog("Digite o valor do raio: ");
            valorDoRaio = Float.parseFloat(auxiliar);

            // Calculando a área do círculo
            areaDoCirculo = (valorDoRaio * valorDoRaio) * pI;
            JOptionPane.showMessageDialog( null,
                "O valor da área do círculo é: " + areaDoCirculo
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null,
                "Erro: Digite um valor válido"
            );
        }
    }
}
