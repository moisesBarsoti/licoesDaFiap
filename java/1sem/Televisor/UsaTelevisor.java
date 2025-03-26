package br.com.praticando.fiap.Televisor;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();

        // Definindo valores dos atributos
        televisor.canal = 7;
        televisor.volume = 15;

        // Alterando o volume
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.aumentarVolume();

        // Alterando o canal
        televisor.trocarCanal(5);

        System.out.println("Canal atual: " + televisor.canal + "\nVolume: " + televisor.volume);
    }
}
