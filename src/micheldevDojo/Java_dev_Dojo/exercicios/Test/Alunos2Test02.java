package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Aluno;
import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Alunos02;

public class Alunos2Test02 {
    public static void main(String[] args) {
        Alunos02[] ListaDeAlunos = new Alunos02[3];
        Alunos02 aluno1 = new Alunos02();
        Alunos02 aluno2 = new Alunos02();
        Alunos02 aluno3 = new Alunos02();
        ListaDeAlunos[0] = aluno1;
        ListaDeAlunos[1] = aluno2;
        ListaDeAlunos[2] = aluno3;
        aluno1.nome = "Michel";
        aluno1.idade = 29;
        aluno1.notas = 9.0;

        aluno2.nome = "mauro";
        aluno2.idade = 19;
        aluno2.notas = 9.0;


        aluno3.nome = "Pedro";
        aluno3.idade = 39;
        aluno3.notas = 9.0;


       for(Alunos02 aluno:ListaDeAlunos){
           aluno.imprimirDados();

       }


    }
}
