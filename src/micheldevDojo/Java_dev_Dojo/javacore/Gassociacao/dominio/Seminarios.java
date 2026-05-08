package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio;

public class Seminarios {
    private String titulo;
    private Alunos[] alunos;
    private Local local;

    public Seminarios(String titulo, Alunos[] alunos, Local local) {
        this.local = local;
        this.alunos = alunos;
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Alunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public Seminarios(String titulo, Alunos[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Seminarios(String titulo) {
        this.titulo = titulo;
    }
}
