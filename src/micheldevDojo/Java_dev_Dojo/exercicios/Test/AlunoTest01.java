package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Michel";
        aluno.nota1 = 9;
        aluno.nota2 = 9;
        aluno.nota3 = 3;


        aluno.calcularMedia();

    }
}
