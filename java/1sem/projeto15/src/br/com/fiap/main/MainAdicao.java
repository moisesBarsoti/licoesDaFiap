package br.com.fiap.main;

import br.com.fiap.bean.Adicao;

import javax.swing.*;

public class MainAdicao {
    public static void main(String[] args) {
        Adicao adicao = new Adicao();
        String auxiliar, escolha="sim";
        int opcao, n1, n2;
        double n1D, n2D;

        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog(null,
                "Digite a opção que deseja somar: \n(1) Números inteiros \n(2) Números reais");

                opcao = Integer.parseInt(auxiliar);

                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
                        n1 = Integer.parseInt(auxiliar);
                        auxiliar = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
                        n2 = Integer.parseInt(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format(
                                "%d + %d = %d",
                                n1,
                                n2,
                                adicao.somar(n1,n2)
                        ));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
                        n1D = Double.parseDouble(auxiliar);
                        auxiliar = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
                        n2D = Double.parseDouble(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format(
                                "%.2f + %.2f = %.2f",
                                n1D,
                                n2D,
                                adicao.somar(n1D,n2D)
                        ));
                        break;
                    default:
                        throw new Exception("Escolha incorreta!");
                }
                escolha = JOptionPane.showInputDialog(null, "Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
            JOptionPane.showMessageDialog(null, "Programa Finalizado. Volte sempre!");
    }
}
