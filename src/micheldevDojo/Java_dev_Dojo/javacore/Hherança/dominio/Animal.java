package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Animal {
    private String nome;
    private int idade;

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

    public void apresentar(){
        System.out.println("Meu nome é : " + this.nome);
        System.out.println("Tenho a idade de: " + this.idade);

    }
}
