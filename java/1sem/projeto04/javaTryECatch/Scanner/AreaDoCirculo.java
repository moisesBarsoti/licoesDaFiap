// 3. Monte um programa que peça para o usuário digitar o valor do raio
//de um círculo e exiba a área deste círculo (lembrete: área do círculo =
//PI * raio²)

package javaTryECatch.Scanner;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        float pI = 3.14f, valorDoRaio, areaDoCirculo;
        Scanner scan = new Scanner(System.in);

        try {
            // Recebendo o valor do raio
            System.out.println("Digite o valor do raio: ");
            valorDoRaio = scan.nextFloat();

            // Calculando a área do círculo
            areaDoCirculo = (valorDoRaio * valorDoRaio) * pI;
            System.out.println("A área do círculo é: " + areaDoCirculo);
        } catch (Exception e) {
            System.out.println("Erro: Digite um número válido!");
        }
    }
}
