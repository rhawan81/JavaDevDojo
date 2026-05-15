package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Notebook extends Produto{
    private String processador;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Processador: " + this.processador);
    }




}
