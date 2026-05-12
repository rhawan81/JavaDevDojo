package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Carro extends Veiculo{
    private int numeroDePortas ;


    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    public void mover(){
        super.mover();
        System.out.println("Numero de Portas : "+ this.numeroDePortas);
    }
}
