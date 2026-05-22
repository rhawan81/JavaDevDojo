package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Moto extends Veiculo {

    private String modelo;
    private double preco;


    public Moto(String marca, int ano, String modelo, double preco) {
        super(marca, ano);
        this.modelo = modelo;
        this.preco = preco;
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço: " + this.preco);
    }

}
