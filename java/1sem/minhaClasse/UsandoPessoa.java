package br.com.praticando.fiap.minhaClasse;

public class UsandoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // Definindo valores
        pessoa.nome = "Joao";
        pessoa.idade = 22;
        pessoa.anoDeNascimento = 2003;

        // Mudando valores
        pessoa.mudarNome("Moisés");
        pessoa.mudarIdade(19);
        pessoa.mudarAnoDeNascimento(2005);

        System.out.println(
        "Nome: " + pessoa.nome +
        "\nIdade: " + pessoa.idade +
        "\nAno de nascimento: " + pessoa.anoDeNascimento);
    }
}
