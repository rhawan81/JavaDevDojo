package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Moto extends Veiculo {
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }
    public void mover(){
        super.mover();
        System.out.println("A moto tem "+ this.cilindradas + " cilindradas");
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
