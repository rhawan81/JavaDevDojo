package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Biblioteca {
    private Livro[] livros;

    public Biblioteca(Livro[] livros) {
        this.livros = livros;
    }

    public void listarLivros() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livros) {
            livro.imprimir();
            System.out.println("---");
        }
    }

    public void buscarPorAutor(String nome) {
        System.out.println("Buscando livros do autor: " + nome);
        for (Livro livro : livros) {
            if (livro.getAutor().getNome().contains(nome)) {
                livro.imprimir();
                System.out.println("---");
            }
        }
    }
}