// Dentrodesta classe crie o método main.
// Dentro dométodomain, exiba no console com o método println() cada uma das
// questões e sua respectiva resposta

package br.com.praticando.fiap;

public class Questionarios {
    public static void main(String[] args) {
        // 1º Pergunta
        System.out.println("1) Explique a orientação à Objetos");
        System.out.println("POO, significa trazer elementos do mundo real para objetos\n");

        // 2º Pergunta
        System.out.println("2) Explique o que é objeto");
        System.out.println("Um objeto é utilizado para representar coisas do mundo real\n");

        // 3º Pergunta
        System.out.println("3) Explique o que é classe");
        System.out.println("É uma entidade para representar um objeto\n");

        // 4º Pergunta
        System.out.println("4) Explique o que é abstração");
        System.out.println("Abstração é o processo de esconder os detalhes de implementação e exibir apenas a funcionalidade essencial de um objeto\n");

        // 5º Pergunta
        System.out.println("5) Explique o que é herança");
        System.out.println("A herança, você pode herdar comportamentos de outras classes\n");

        // 6º Pergunta
        System.out.println("6) Explique o que é encapsulamento");
        System.out.println("Consiste na separação dos aspectos externos de um objeto\n");

        // 7º Pergunta
        System.out.println("7) Explique o que é polimorfismo");
        System.out.println("Significa ter muitas formas, que significa um único nome representando um código diferente selecionado por um mecanismo automatico\n");

        // 8º Pergunta
        System.out.println("8) Quais é os principais tipos de polimorfismo? Explique cada um deles");
        System.out.println("Os principais tipos são: sobreescrita e sobrecarga\n" + "Sobreescrita: São metodos com o mesmo nome, mas com funcionalidades diferentes\n" + "Sobrecarga: Ocorre quando existem dois metodos ou + com mesmo nome, na mesma classe com assinaturas diferentes");
    }
}
