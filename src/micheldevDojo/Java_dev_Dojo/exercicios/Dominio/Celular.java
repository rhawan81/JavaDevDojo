package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Celular {

    private String marca;
    private String modelo;
    private double preco;


    public Celular(String marca) {
        this.marca = marca;
    }
    public Celular(String marca, String modelo){
        this(marca);
        this.modelo = modelo;
    }
    public Celular(String marca, String modelo,double preco){

        this(marca,modelo);
        this.preco = preco;

    }

    public void imprime(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço: " + this.preco);
    }



}
