package br.com.fiap.bean;

public class FolhaDePagamento {
    // Atributos
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    // Metodos
    public double calcularSalarioLiquido() {
        double valorDescontoINSS = salarioBruto * descontoINSS;
        double valorDescontoPlanoSaude  = numeroDeDependentes * valorPlanoDeSaude;
        double salarioLiquido = salarioBruto - valorDescontoINSS - valorDescontoPlanoSaude;

        return salarioLiquido;
    }
}
