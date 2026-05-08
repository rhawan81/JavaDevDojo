package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.test;

import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Carro;
import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Pessoa;

public class CarroTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Michel",19);
        Carro carro = new Carro(pessoa,"Posrche", "Sportivo");
        carro.imprime();

    }
}
