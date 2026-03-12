package micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.test;

import micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio.Estudante;
import micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante1.nome = "Jose";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "maria";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

// Criamos uma classe onde imprime o objeto de referencia que é estudante e eliminamos redundancia deixando o codigo mais coeso.
        impressora.ImprimeEstudante(estudante1);
        impressora.ImprimeEstudante(estudante2);
        impressora.ImprimeEstudante(estudante1);

    }
}
