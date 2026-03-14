package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Calculadora;

public class ExercicioSobrecargaCalculadoratest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.soma(4,1));
        System.out.println(calculadora.soma(3,3 , 3));
        System.out.println(calculadora.soma(5.0,2.5));


    }
}
