package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Produto {
    private String nome;
    private double preco;

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
    }






}
