package micheldevDojo.Java_dev_Dojo.javacore.Fmodificadorestaticos.test;

import micheldevDojo.Java_dev_Dojo.javacore.Fmodificadorestaticos.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Bmw" , 280);
        Carro carro2 = new Carro("Mercedez", 275);
        Carro carro3 = new Carro("Audi", 290);
        carro1.setVelocidadeLimite(180);
        // outro jeito de passar a velocidade para a classe carro.
        Carro.velocidadeLimite = 180;
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
