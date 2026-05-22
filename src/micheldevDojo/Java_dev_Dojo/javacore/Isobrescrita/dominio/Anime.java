package micheldevDojo.Java_dev_Dojo.javacore.Isobrescrita.dominio;

public class Anime  {

    private String nome;


    @Override
    public String toString(){ // ele substitui pelo hashcode quando chamamos o objeto
         // na main ou seja ira substituir pelo que estou passando no return por isso o uso do override

        return "Anime: " + this.nome;
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
