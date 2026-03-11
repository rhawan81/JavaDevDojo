package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Produto();


        produto.adicionarEstoque(1," PS5");
        produto.exibirEstoque();

    }
}
