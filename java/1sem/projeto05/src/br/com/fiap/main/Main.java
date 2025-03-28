package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

public class Main {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();

        folha.salarioBruto = 50000;
        folha.valorPlanoDeSaude = 600;
        folha.numeroDeDependentes = 3;

        System.out.println(folha.calcularSalarioLiquido());
    }
}
