package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // Instanciando Televisor
//        Televisor televisao = new Televisor();
//
//        // Instanciando Scanner
//        Scanner scan = new Scanner(System.in);
//
//        // Adicionando valores
////        televisao.setCanal(2);
////        televisao.setVolume(20);
////        televisao.diminuirVolume();
////        televisao.diminuirVolume();
//
//        int escolha;
//        try {
//
//            System.out.println("Digite um canal e defina o volume");
//            televisao.setCanal(scan.nextInt());
//            televisao.setVolume(scan.nextInt());
//
//            // Menu
//            System.out.println("Faça a sua escolha \n(1) Definir novo canal \n(2) Definir novo volume \n(3) Aumentar volume \n(4) Diminuir volume");
//            escolha = scan.nextInt();
//
//            // Condição do Menu
//            if (escolha == 1) {
//                System.out.println("Digite um novo canal:");
//                televisao.setCanal(scan.nextInt());
//            } else if (escolha == 2) {
//                System.out.println("Digite um novo volume: ");
//                televisao.setVolume(scan.nextInt());
//            } else if (escolha == 3) {
//                televisao.aumentarVolume();
//                System.out.println("Aumentando o volume...");
//            } else {
//                televisao.diminuirVolume();
//                System.out.println("Diminuindo o volume...");
//            }
//
//            // Exibindo os valores
//            System.out.printf("Canal: %d \nVolume: %d", televisao.getCanal(), televisao.getVolume());
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        // Instanciado o ArCondicionado
        ArCondicionado ar = new ArCondicionado();

        // Instanciando o Scanner
        Scanner scan = new Scanner(System.in);

        int escolha;
        try {
            // Modo Inicial
            System.out.println("Defina a temperatura(15º até 26º) e o modo( Ventilar, Aquecer, Resfriar ):");
            ar.setTemperatura(scan.nextInt());
            ar.setModo(scan.next());

            // Modos
            System.out.println("Escolha os modos: \n(1) Mudar de modo \n(2) Aumentar a temperatura \n(3) Diminuir a temperatura\n");
            escolha = scan.nextInt();

            // Condição dos Modos
            if (escolha == 1) {
                System.out.println("Escreva o novo modo");
                ar.setModo(scan.next());
            } else if (escolha == 2) {
                ar.aumentarTemperatura();
                System.out.println("Aumentando a temperatura...");
            } else {
                ar.diminuirTemperatura();
                System.out.println("Diminuindo a temperatura...");
            }

            // Exibindo Valores
            System.out.printf("Modo: %s \nTemperatura: %d", ar.getModo(), ar.getTemperatura());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}