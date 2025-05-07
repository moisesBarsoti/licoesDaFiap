package br.com.fiap.main;

import br.com.fiap.bean.Gestante;

import javax.swing.*;
import java.time.LocalDate;

public class MainGestante {
    public static void main(String[] args) {
        Gestante gestante;
        String nome, auxiliar, dataEUA;
        LocalDate dataDaGestacao;

        try {
            nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
            auxiliar = JOptionPane.showInputDialog(null, "Digite a data de início da gestação (dd-MM-yyyy): ");
            String ano = auxiliar.substring(6, 10);
            String mes = auxiliar.substring(3, 5);
            String dia = auxiliar.substring(0, 2);
            dataEUA = ano + "-" + mes + "-" + dia;
            dataDaGestacao = LocalDate.parse(dataEUA);

            gestante = new Gestante(nome, dataDaGestacao);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite uma data válida");
        }
    }
}
