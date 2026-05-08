package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite  seu nome abaixo");
        String next = entrada.nextLine();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu Sexo");
        char sexo = entrada.next().charAt(0);

        System.out.println("Nome: " + next);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);


    }
}
