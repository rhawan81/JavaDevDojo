package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class JogoDigital extends Jogo{
    private String plataforma;

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    @Override
    public void imprimir(){
        System.out.println("Imprimindo os dados do jogo digital");
        System.out.println("Titulo : " + this.titulo);
        System.out.println("Ano : " + this.anoLancamento);
        System.out.println("Plataforma : " + this.plataforma);

    }
}
