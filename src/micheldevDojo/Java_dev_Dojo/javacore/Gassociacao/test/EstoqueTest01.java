package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.test;

import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Estoque;
import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Produto;

public class EstoqueTest01 {
    public static void main(String[] args) {
        Estoque estoque = new Estoque( 12);
        Produto produto1 = new Produto("Arroz", 10);
        Produto produto2 = new Produto("Macarrao", 15);
        Produto produto3 = new Produto("Sardinha", 120);
        Produto produto4 = new Produto("Biscoito", 199.0);
        Produto produto5 = new Produto("Carne", 50);
        Produto produto6 = new Produto("Açucar", 5);
        Produto produto7 = new Produto("Caderno", 20);
        Produto produto8 = new Produto("Lapis", 10);

        Produto[] prods = {produto1,produto2,produto3,produto4,produto5,produto6,produto7,produto8};
        estoque.setProdutos(prods);
        System.out.println(estoque.buscaProduto("Carne"));

    }
}
