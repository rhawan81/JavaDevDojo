package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;

import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Animal;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Cachorro;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Gato;

public class TestdasClasses {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        cachorro.emitirSom();
        gato.emitirSom();


    }
}
