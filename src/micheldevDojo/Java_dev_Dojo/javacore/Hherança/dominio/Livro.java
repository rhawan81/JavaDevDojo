package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private double preco;
    Autor autor;

    public String getTitulo() {
        return titulo;
    }
    public void imprimir(){
        System.out.println(this.titulo);
        System.out.println(this.anoPublicacao);
        System.out.println(this.preco);

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(String titulo, Autor autor, double preco, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.anoPublicacao = anoPublicacao;
    }
}
