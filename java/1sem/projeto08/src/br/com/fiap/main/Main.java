package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {
        // Instanciando Televisor
        Televisor televisao = new Televisor();

        // Adicionando valores
        televisao.setCanal(2);
        televisao.setVolume(20);
        televisao.diminuirVolume();
        televisao.diminuirVolume();
        System.out.printf("Canal: %d \nVolume: %d", televisao.getCanal(), televisao.getVolume());
    }
}