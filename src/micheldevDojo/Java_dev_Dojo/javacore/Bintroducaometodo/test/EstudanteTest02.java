package micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.test;

import micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio.Estudante;
import micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Jose";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "maria";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        estudante01.imprime();


    }
}
