package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;

import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Cachorro;

public class CachorroTest01 {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.setNome("Rex");
        dog.setIdade(5);
        dog.setRaca("Labrador");

        dog.apresentar();
    }
}
