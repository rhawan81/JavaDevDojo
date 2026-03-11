package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Produto();


        produto.nome = "PS5";
        produto.preco = 5000;
        produto.adicionarEstoque(5);
        produto.exibirEstoque();
        produto.removerEstoque(2);
        produto.exibirEstoque();


    }
}
