package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.JOptionPane;

public class MainJOptionPane {
    public static void main(String[] args) {
        // Declarando as variáveis
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;

        // Instanciando
        FolhaDePagamento folha = new FolhaDePagamento();
        String auxiliar;

        try {
            // Salário Bruto
            auxiliar = JOptionPane.showInputDialog("Digite o salário bruto: ");
            salarioBruto = Double.parseDouble(auxiliar);

            // Desconto INSS
            auxiliar = JOptionPane.showInputDialog("Digite o desconto do INSS: ");
            descontoINSS = Double.parseDouble(auxiliar);

            // Dependentes
            auxiliar = JOptionPane.showInputDialog("Digite o número de dependentes: ");
            numeroDeDependentes = Integer.parseInt(auxiliar);

            // Valor do plano de saúde
            auxiliar = JOptionPane.showInputDialog("Digite o desconto do plano de saúde: ");
            valorPlanoDeSaude = Double.parseDouble(auxiliar);

            // Atribuindo valores ao objeto
            folha.salarioBruto = salarioBruto;
            folha.descontoINSS = descontoINSS;
            folha.numeroDeDependentes = numeroDeDependentes;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;

            // Exibindo resultado
            System.out.printf("Salário Bruto: R$ %.2f\nDependentes: %d\nINSS: %.1f%%\nPlano de Saúde: R$ %.2f\nSalário Líquido: R$ %.2f", folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }
    }
}
