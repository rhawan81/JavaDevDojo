package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;

import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Autor;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Livro;


public class Bibliotecatest01 {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        Autor autor2 = new Autor();
        Livro livro1 = new Livro("Harry poter",autor1,29.90,92);



        autor2.setNome("George R.R. Martin");
        autor2.setNacionalidade("Americano");
        autor1.setNome("J.K. Rowling");
        autor1.setNacionalidade("Britânica");
        livro1.imprimir();



    }
}
