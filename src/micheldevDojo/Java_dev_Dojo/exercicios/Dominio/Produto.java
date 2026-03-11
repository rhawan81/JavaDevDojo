package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Produto {
    public String nome;
    public double preco;
    public int qntd;


    public void adicionarEstoque(int quantidade , String nomeProd){
        qntd = quantidade;
        System.out.println(qntd + " Produto adicionado: " + nomeProd);
    }
    public void removerEstoque(int quantidade){
        qntd -= quantidade;
        System.out.println("Produto Removido com sucesso !");

    }
    public void exibirEstoque(){
        System.out.println("Produtos Disponiveis : " + nome + " qntd"+qntd);

    }

}
