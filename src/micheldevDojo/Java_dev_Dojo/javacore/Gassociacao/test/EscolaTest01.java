package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.test;

import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Escola;
import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Luiz");
        Professor professor2 = new Professor("Mauro");
        Professor professor3 = new Professor("Marcio");
        Professor[] professores = {professor,professor2,professor3};
        Escola escola = new Escola("Konoha", professores);
        escola.imprime();


    }
}
