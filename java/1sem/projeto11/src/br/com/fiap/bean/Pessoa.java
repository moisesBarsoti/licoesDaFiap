package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    // Atributos
    private String nome;
    private LocalDate dataNascimento;

    // Construtores
    public Pessoa() {}

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        setDataNascimento(dataNascimento);
    }

    // Metodos get/set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        LocalDate dataInicio = LocalDate.parse("1899-12-31");
        LocalDate dataFim = LocalDate.now();
        try {
            if (dataNascimento.isAfter(dataInicio) && dataFim.isBefore(dataFim)) {
                this.dataNascimento = dataNascimento;
            } else {
                throw new Exception("Data fora da data permitida!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0); // Encerra o progama após o erro
        }
    }

    // Metodos da classe
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dataAtual);
        return idade.getYears();
    }
}
