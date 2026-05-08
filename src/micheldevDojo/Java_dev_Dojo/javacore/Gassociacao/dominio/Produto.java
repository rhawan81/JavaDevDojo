package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio;

public class Produto {
    private String nome;
    private double valorProduto;

    public Produto(String nome, double  valorProduto) {
        this.valorProduto = valorProduto;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorProduto() {

        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }


}
