package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Animal {


    private String nome;
    private int idade;



    public Animal(String nome){
        this.nome = nome;
    }

    public Animal(String nome, int idade){
        this(nome);
        this.idade = idade;
    }


    public void imprime(){
        System.out.println( "Nome: " + this.nome);
        System.out.println( "Idade: " + this.idade);
    }

}
