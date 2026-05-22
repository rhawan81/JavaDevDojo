package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Gato extends Animal {

    private String raca;


    public Gato(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public Gato(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }
    @Override
    public void imprime(){
        super.imprime();
        System.out.println( "Raça: " + this.raca);
    }
}
