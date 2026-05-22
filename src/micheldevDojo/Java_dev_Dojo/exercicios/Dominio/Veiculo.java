package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Veiculo {


    private String marca;
    private int ano;


    public Veiculo(String marca){
        this.marca = marca;
    }
    public Veiculo(String marca, int ano){

        this(marca);
        this.ano = ano;
    }

        public void imprime(){
            System.out.println("Marca: " + this.marca);
            System.out.println("Ano: " + this.ano);
        }




}
