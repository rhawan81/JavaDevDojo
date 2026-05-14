package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Caminhao extends Veiculo {
    private double capacidadeDeCarga;

    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void mover(){
        super.mover();

        System.out.println("Capacidade de Carga : "+ this.capacidadeDeCarga);
        System.out.println("Modelo : "+ this.getModelo());
        System.out.println("Marca : "+ this.getMarca());
        System.out.println("Ano : "+ this.getAno());
        System.out.println("Velocidade : "+ this.getVelocidade() + " KM/h");

    }

    public void setCapacidadeDeCarga(double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
}
