package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Celular extends Produto {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void  exibir(){
        super.exibir();
        System.out.println("Marca: " + this.marca);
    }

}
