package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Moto extends Veiculo {

    private String modelo;
    private double preco;



    public Moto(String marca , int ano, String modelo){
        super(marca,ano);
        this.modelo = modelo;
    }


}
