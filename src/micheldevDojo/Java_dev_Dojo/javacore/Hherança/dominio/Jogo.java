package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Jogo {
    protected String titulo;
    protected int anoLancamento;


    public void imprimir(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Ano de Lançamento: "+ this.anoLancamento);
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
