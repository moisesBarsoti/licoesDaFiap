package br.com.fiap.bean;

import javax.swing.*;

public class Geometria {
    // Atributos
    private float lado;
    private float altura;
    private double raio;

    // Construtores
    public Geometria() {
    }

    // Métodos get/set

    // Raio
    public double getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    // Altura
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Lado
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    // Métodos da classe
    public void calcularArea(float lado) {
        setLado(lado);
        float area = (float) Math.pow(this.lado, 2);
        JOptionPane.showMessageDialog(null, String.format("Área do quadrado: %.2f", area));
    }
    public void calcularArea(float lado, float altura) {
        setLado(lado);
        setAltura(altura);
        float area = this.lado * this.altura;
        JOptionPane.showMessageDialog(null, String.format("Área do retângulo: %.2f", area));
    }
    public void calcularArea(double raio) {
        setRaio((float) raio);
        double area = Math.PI * Math.pow(this.raio, 2);
        JOptionPane.showMessageDialog(null, String.format("Área do círculo: %.2f", area));
    }
}
