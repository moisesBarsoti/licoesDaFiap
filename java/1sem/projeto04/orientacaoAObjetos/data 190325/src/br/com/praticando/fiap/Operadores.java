// Dentro do método main, crie variáveis dos mais diversos tipos numéricos,
// realize operações aritméticas com essas variáveis e armazene os resultados e
// finalmente exiba no console com o método println() cada valor das variáveis, a
// operação utilizada e seus resultados (utilize as sequências de escape para pular
// de linha e organizar a mensagem exibida)

package br.com.praticando.fiap;

public class Operadores {
    public static void main(String[] args) {
        // Selecionando valores inteiros
        byte numero32 = 32;
        short numero100 = 100;
        int numero2000 = 2000;
        long numero10000 = 10000L;

        // Selecionando valores decimais
        float numero175F = 1.75f;
        double numero400D = 4.00f;

        // Realizando as operações aritméticas

        // Adição

        // Adição com inteiros
        int conta1Adicao = numero32 + numero100;
        long conta2Adicao = numero2000 + numero10000;

        // Adição com decimal
        double conta1AdicaoDecimal = numero175F + numero400D;


        // Subtração

        // Subtração com inteiros
        int conta1Subtracao = numero32 - numero100;
        long conta2Subtracao = numero2000 - numero10000;

        // Subtração com decimal
        double conta1SubtracaoDecimal = numero175F - numero400D;


        // Multiplicação

        // Multiplicação com inteiros
        int conta1Multiplicacao = numero32 * numero100;
        long conta2Multiplicacao = numero2000 * numero10000;

        // Multiplicação com decimal
        double conta1MultiplicacaoDecimal = numero175F * numero400D;


        // Divisão

        // Divisão com inteiros
        int conta1Divisao = numero100 / numero32;
        long conta2Divisao = numero10000 / numero2000;

        // Divisão com decimal
        double conta1DivisaoDecimal = numero175F / numero400D;


        // Exibindo os valores

        System.out.println("\nOperações Aritméticas\n");
        System.out.println("Adição: \n");
        System.out.println("Primeira conta: " + numero32 + " + " + numero100 + " = " + conta1Adicao);
        System.out.println("Segunda conta: " + numero2000 + " + " + numero10000 + " = " + conta2Adicao);
        System.out.println("Terceira conta: " + numero175F + " + " + numero400D + " = " + conta1AdicaoDecimal + "\n");
        System.out.println("Subtração: \n");
        System.out.println("Primeira conta: " + numero32 + " - " + numero100 + " = " + conta1Adicao);
        System.out.println("Segunda conta: " + numero2000 + " - " + numero10000 + " = " + conta2Adicao);
        System.out.println("Terceira conta: " + numero175F + " - " + numero400D + " = " + conta1AdicaoDecimal + "\n");
        System.out.println("Multiplicação: \n");
        System.out.println("Primeira conta: " + numero32 + " * " + numero100 + " = " + conta1Multiplicacao);
        System.out.println("Segunda conta: " + numero2000 + " * " + numero10000 + " = " + conta2Multiplicacao);
        System.out.println("Terceira conta: " + numero175F + " * " + numero400D + " = " + conta1MultiplicacaoDecimal + "\n");
        System.out.println("Divisão: \n");
        System.out.println("Primeira conta: " + numero100 + " / " + numero32 + " = " + conta1Divisao);
        System.out.println("Segunda conta: " + numero10000 + " / " + numero2000 + " = " + conta2Divisao);
        System.out.println("Terceira conta: " + numero175F + " / " + numero400D + " = " + conta1DivisaoDecimal + "\n");
    }
}
