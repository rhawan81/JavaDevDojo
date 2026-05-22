package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Animal;
import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Gato;

public class Animaltest01 {
    public static void main(String[] args) {
        Animal animal = new Animal("Rex", 5);
        Gato gato = new Gato("Gato",19, "Siamês");
        gato.imprime();

    }
}
