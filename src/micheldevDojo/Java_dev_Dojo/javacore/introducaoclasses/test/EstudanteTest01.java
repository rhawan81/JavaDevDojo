package micheldevDojo.Java_dev_Dojo.javacore.introducaoclasses.test;

import micheldevDojo.Java_dev_Dojo.javacore.introducaoclasses.dominio.Estudante;

import java.sql.SQLOutput;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 21;
        estudante.nome = "Michel";
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
