package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numeroMaior = calculadora.maior(10,20,30,40,50,800);
        int numeroMenor = calculadora.menorNum(2,3,20,30);
        double media = calculadora.media(29.0, 28.0 , 30.2);
        int contarNums = calculadora.contarPares(1,2,3,4,5,6,7,8,9,10);
        calculadora.maiorEMenor(1,2,3,4,5,6,7,8,9,10);
        System.out.println("O numero menor numero é: " + numeroMenor);
        System.out.println("O numero maior numero é: " + numeroMaior);
        System.out.println("A media é: " + media);
        System.out.println("A quantidade de numeros pares é de :  " + contarNums);
    }
}
