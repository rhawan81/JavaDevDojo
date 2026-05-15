package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;

import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Autor;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Biblioteca;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Livro;


public class Bibliotecatest01 {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        Autor autor2 = new Autor();

        autor1.setNome("J.K. Rowling");
        autor1.setNacionalidade("Britânica");

        autor2.setNome("George R.R. Martin");
        autor2.setNacionalidade("Americano");

        Livro livro1 = new Livro("Harry Potter", autor1, 29.90, 1997);
        Livro livro2 = new Livro("A Guerra dos Tronos", autor2, 79.90, 1996);
        Livro livro3 = new Livro("Harry Potter e a Câmara Secreta", autor1, 34.90, 1998);
        Livro livro4 = new Livro("Os Ventos do Inverno", autor2, 89.90, 2025);

        Livro []  livros = {livro1, livro2, livro3, livro4};
        Biblioteca biblioteca = new Biblioteca(livros);

        biblioteca.listarLivros();
        System.out.println("---");
        biblioteca.buscarPorAutor("Rowling");


    }
}
