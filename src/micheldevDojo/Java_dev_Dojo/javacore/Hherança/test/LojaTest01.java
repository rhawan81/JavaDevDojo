package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;

import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Celular;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Notebook;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Produto;

public class LojaTest01 {
    public static void main(String[]args){
        Produto produto = new Produto();
        Celular poco = new Celular();
        Notebook asus = new Notebook();

        produto.setNome("Playstation 5");
        produto.setPreco(5000);
        System.out.println("-----------------------");
        poco.setMarca("Xiaomi");
        poco.setNome("Poco X7 Pro");
        poco.setPreco(2500);
        System.out.println("-----------------------");
        asus.setNome("Notebook Asus");
        asus.setPreco(4000);
        asus.setProcessador("Ryzen 5");


        produto.exibir();
        poco.exibir();
        asus.exibir();













    }





















}
