package micheldevDojo.Java_dev_Dojo.javacore.Aintroducaoclasses.test;

import micheldevDojo.Java_dev_Dojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    /* Pequeno exercicio da aula crie uma classe
    onde o carro ira receber os seguintes atributos
     */
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.NomeCarro = "Ferrari";
        carro.ModeloCarro = " Spider 08";
        carro.AnoDoCarro = 2009;
/*
Caso quisermos referenciar o carro1 para o carro2
fariamos da seguinte forma carro1 = carro;
 */

        Carro carro2 = new Carro();
        carro2.NomeCarro = "porche";
        carro2.ModeloCarro = " Carrera GT";
        carro2.AnoDoCarro = 2025;


        System.out.println(" Nome : " + carro.NomeCarro + ", Modelo :" + carro.ModeloCarro + " Ano:" + carro.AnoDoCarro);
        System.out.println(" Nome : " + carro2.NomeCarro + ", Modelo :" + carro2.ModeloCarro + " Ano:" + carro2.AnoDoCarro);
    }


}
