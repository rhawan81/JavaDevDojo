package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Aluno {
    public String nome;
    public int nota1 ;
    public int nota2 ;
    public int nota3 ;



    public void calcularMedia(){
        int mediaAluno = (nota1 + nota2 + nota3) / 3;
        if(mediaAluno >= 7){
            System.out.println("Aluno Aprovado");
        }
        else{
            System.out.println("Aluno Reprovado !!! ");
        }
    }
}
