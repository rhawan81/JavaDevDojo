package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Cachorro extends Animal {
    private String raca;

    public String getRaca() {
        return raca;
    }
    public void apresentar(){
        super.apresentar();
        System.out.println(this.raca);
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
