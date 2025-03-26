package br.com.praticando.fiap.ArCondicionado;

public class ArCondicionado {
    // Atributos
    public int temperatura;
    public String modo;

    // Metodos
    public void aumentarTemperatura() {
        temperatura++;
    }

    public void diminuirTemperatura() {
        temperatura--;
    }

    public void trocarModo(String novoModo) {
        modo = novoModo;
    }
}
