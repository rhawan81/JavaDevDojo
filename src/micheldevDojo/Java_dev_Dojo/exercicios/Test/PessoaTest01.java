package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Pessoas;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoas pessoa  = new Pessoas();
        Pessoas pessoa2 = new Pessoas();
        Pessoas pessoa3 = new Pessoas();


        pessoa.nome = "Maria";
        pessoa.idade = 29;
        pessoa.altura = 2.19;
        System.out.println("-----------");

        pessoa2.nome = "Michel";
        pessoa2.idade = 22;
        pessoa2.altura = 1.76;
        System.out.println("---------------");

        pessoa3.nome = "Augusto";
        pessoa3.idade = 28;
        pessoa3.altura = 1.98;




        pessoa.ImprimirPessoas();
        System.out.println("---------------");
        pessoa2.ImprimirPessoas();
        System.out.println("---------------");
        pessoa3.ImprimirPessoas();


    }
}
