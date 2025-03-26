package br.com.praticando.fiap.minhaClasse;

public class Pessoa {
    // Atributos
    String nome;
    int idade;
    int anoDeNascimento;

    // Metodos
    public void mudarNome(String novoNome) {
        nome = novoNome;
    }

    public void mudarIdade(int novaIdade) {
        idade = novaIdade;
    }

    public void mudarAnoDeNascimento(int novoAno) {
        anoDeNascimento = novoAno;
    }
}
