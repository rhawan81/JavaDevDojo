package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.test;

import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Alunos;
import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Local;
import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Professores;
import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Seminarios;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("UNINASSAU");
        Alunos aluno = new Alunos("Michel", 17);
        Professores professor = new Professores("Gustavo", "Matematica");
        Alunos[] alunosParaSeminario = {aluno};

        Seminarios seminario = new Seminarios("Onde achar one piece", alunosParaSeminario,local);
        Seminarios[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.relatorio();



    }
}
