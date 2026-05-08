package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio;

public class Alunos {

    private String nome;
    private int idade;
    private Seminarios seminario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminarios getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminarios seminario) {
        this.seminario = seminario;
    }

    public Alunos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}