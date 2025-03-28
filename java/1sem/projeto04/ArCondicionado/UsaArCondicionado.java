package br.com.praticando.fiap.ArCondicionado;

public class UsaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado();

        // Definindo os atributos
        arCondicionado.modo = "Aquecer";
        arCondicionado.temperatura = 20;

        // Alterando os valores
        arCondicionado.modo = "Ventilar";
        arCondicionado.temperatura = 25;

        System.out.println("Temperatura: " + arCondicionado.temperatura + "\nModo: " + arCondicionado.modo);
    }
}
