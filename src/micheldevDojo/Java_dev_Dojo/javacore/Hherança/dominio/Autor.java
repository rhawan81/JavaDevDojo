package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Autor extends Pessoa{
    private String nacionalidade;

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void imprime(){
        super.imprime();
        System.out.println("Minha nacionalidade é + " + this.nacionalidade);
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


}
