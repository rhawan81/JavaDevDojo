package micheldevDojo.Java_dev_Dojo.javacore.Fmodificadorestaticos.test;

import micheldevDojo.Java_dev_Dojo.javacore.Fmodificadorestaticos.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Bmw" , 280);
        Carro carro2 = new Carro("Mercedez", 275);
        Carro carro3 = new Carro("Audi", 290);

        // outro jeito de passar a velocidade para a classe carro., podendo ou nao ter objeto.
        Carro.setVelocidadeLimite(180);
        System.out.println(Carro.getVelocidadeLimite());

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
