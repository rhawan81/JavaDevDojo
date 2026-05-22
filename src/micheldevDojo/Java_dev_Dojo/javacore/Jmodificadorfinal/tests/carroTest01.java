package micheldevDojo.Java_dev_Dojo.javacore.Jmodificadorfinal.tests;

import micheldevDojo.Java_dev_Dojo.javacore.Jmodificadorfinal.dominio.Carro;
import micheldevDojo.Java_dev_Dojo.javacore.Jmodificadorfinal.dominio.Comprador;

public class carroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Michel");
        System.out.println(carro.COMPRADOR);


    }
}
