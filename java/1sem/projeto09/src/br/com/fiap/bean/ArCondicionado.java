package br.com.fiap.bean;

public class ArCondicionado {
    // Atributos
    private int temperatura;
    private String modo;

    // Metodos get/set

    // Temperatura
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        try {
            if (temperatura >= 15 && temperatura <= 26) {
                this.temperatura = temperatura;
            } else {
                throw new Exception("Você so pode mudar a temperatura em 15º até 26º");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Modo
    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        try {
            if (modo.equalsIgnoreCase("Ventilar") || modo.equalsIgnoreCase("Aquecer") || modo.equalsIgnoreCase("Resfriar")) {
                this.modo = modo;
            } else {
                throw new Exception("Somente existe os modos: ( Ventilar, Aquecer, Resfriar )");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Metodos da classe

    public void aumentarTemperatura() {
        if (temperatura >= 15 && temperatura <= 26) {
            temperatura++;
        }
    }

    public void diminuirTemperatura() {
        if (temperatura >= 15 && temperatura <= 26) {
            temperatura--;
        }
    }
}
