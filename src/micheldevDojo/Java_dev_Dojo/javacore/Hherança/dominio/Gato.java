package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Gato extends Animal {
    private String nome;
    private String raca;



    @Override
    public void emitirSom(){
        System.out.println("Miau miau miau...");
    }
}
