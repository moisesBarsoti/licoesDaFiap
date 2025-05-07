package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {
    // Atributos
    private String nome;
    private LocalDate dataDaGestacao;

    // Construtores
    public Gestante() {}

    public Gestante(String nome, LocalDate dataDaGestacao) {
        this.nome = nome;
        setDataDaGestacao(dataDaGestacao);
    }

    // Métodos get/set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }

    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        try {
            LocalDate dataInicio = LocalDate.parse("2024-07-29");
            LocalDate dataAtual = LocalDate.now();
            if (dataDaGestacao.isAfter(dataInicio) && dataDaGestacao.isBefore(dataAtual)) {
                this.dataDaGestacao = dataDaGestacao;
            } else {
                throw new Exception("Exiba uma data atual e até 9 meses atrás");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // Métodos da Classe
    public int tempoDeGestacao() {
        LocalDate dataAtual = LocalDate.now();
        Period tempoDeGestacao = Period.between(dataDaGestacao, dataAtual);
        return tempoDeGestacao.getMonths();
    }
}
