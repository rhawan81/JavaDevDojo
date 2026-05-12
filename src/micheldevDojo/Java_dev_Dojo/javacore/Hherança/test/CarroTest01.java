package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;

import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setAno("2020");
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setNumeroDePortas(3);


        carro.mover();
    }
}
