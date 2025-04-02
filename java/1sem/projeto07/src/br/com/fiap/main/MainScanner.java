package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        // Declarando as variáveis
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;

        // Instanciando
        FolhaDePagamento folha = new FolhaDePagamento();
        Scanner scan = new Scanner(System.in);

        try {
            // Salário Bruto
            System.out.println("Digite o salário bruto: ");
            salarioBruto = scan.nextDouble();

            // Desconto INSS
            System.out.println("Digite o desconto do INSS: ");
            descontoINSS = scan.nextDouble();

            // Dependentes
            System.out.println("Digite o número de dependentes: ");
            numeroDeDependentes = scan.nextInt();

            // Valor do plano de saúde
            System.out.println("Digite o desconto do plano de saúde: ");
            valorPlanoDeSaude = scan.nextDouble();

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
