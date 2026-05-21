package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    public Produto(String nome){
        this.nome = nome;
    }
    public Produto(String nome, double preco){
        this(nome);
        this.preco =preco;
    }
    public Produto(String nome , double preco, int quantidade){
        this(nome, preco);
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }






}
