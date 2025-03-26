package br.com.praticando.fiap.Televisor;

public class Televisor {
    // Atributos
    public int volume;
    public int canal;

    // Metodos
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
