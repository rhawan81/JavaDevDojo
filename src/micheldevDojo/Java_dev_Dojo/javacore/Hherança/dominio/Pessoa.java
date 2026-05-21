package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }
    public void imprime(){

        if(this.endereco != null){
            System.out.println("Endereco: " + this.endereco.getRua() + " " + this.endereco.getCep());
        }
        System.out.println(this.nome);
        System.out.println(this.cpf);


    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
