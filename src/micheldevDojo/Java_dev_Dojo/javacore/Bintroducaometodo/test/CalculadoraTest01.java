package micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.test;

import micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio.Calculadora;


public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora ();
        calculadora.somaDoisNumeros(); // metodo que chamamos do dominio calculadora acessamos ele atraves do .
        System.out.println("Finalizando Calculadora Test01");
        calculadora.subtracaoDoisNumeros();
        System.out.println("Finalizando calculadoratest2");
    }
}
