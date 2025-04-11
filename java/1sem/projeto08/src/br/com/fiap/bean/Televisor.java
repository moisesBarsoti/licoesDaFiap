package br.com.fiap.bean;

public class Televisor {
    // Atributos
    private int volume;
    private int canal;

    // Metodos de get e set

    // Volume
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        try {
            if (volume >= 0 && volume <= 20) {
                this.volume = volume;
            } else {
                throw new Exception("O número mínimo é: 0 e o máximo é 20");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Canal
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        try {
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13) {
                this.canal = canal;
            } else {
                throw new Exception("Você só pode selecionar os canais (2,4,5,7,13)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Metodos da classe
    public void aumentarVolume() {
        if (volume >= 0 && volume <= 20) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume >= 0 && volume <= 20) {
            volume--;
        }
    }
}