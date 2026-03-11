package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Aluno {
    public String nome;
    public double nota1 ;
    public double nota2 ;
    public double nota3 ;



    public void calcularMedia(){
        double mediaAluno = (nota1 + nota2 + nota3) / 3;
        if(mediaAluno >= 7){
            System.out.println("Aluno Aprovado");
        }
        else{
            System.out.println("Aluno Reprovado !!! ");
        }

        System.out.println(" Media do Aluno foi de: " + mediaAluno);
    }
}
