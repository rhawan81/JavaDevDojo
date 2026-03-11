package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Carros;

public class Carrostest01 {
    public static void main(String[] args) {
        Carros carros = new  Carros();
        Carros carros2 = new Carros();
        carros2.nome = "Porsche";
        carros2.modelo = "911";
        carros2.ano = 2026;

        carros.nome = "Porsche";
        carros.modelo = "Carrera Gt3";
        carros.ano = 2021;

        carros.imprimir();
        System.out.println("----------------------------");
        carros2.imprimir();


    }
}
