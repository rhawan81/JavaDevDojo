package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Produto {
    public String nome;
    public double preco;
    public int qntd;


    public void adicionarEstoque(int quantidade){
        qntd += quantidade;
        System.out.println(quantidade + " produto(s) adicionado ao estoque: ");
    }
    public void removerEstoque(int quantidade){
        if(quantidade > qntd){
            System.out.println(" Estoque insuficiente !");
            return;
        }
        qntd -= quantidade;
        System.out.println("Produto Removido com sucesso !");

    }
    public void exibirEstoque(){
        System.out.println("Produtos  : " + nome );
        System.out.println("Quantidade em estoque: " + qntd);

    }

}
