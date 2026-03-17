package micheldevDojo.Java_dev_Dojo.javacore.Fmodificadorestaticos.dominio;

public class Carro {
    // Esse atributo pertence a cada objeto criado.
    private String nome;
    // Cada carro também tem sua própria velocidade máxima.
    private double velocidadeMaxima;
    // `static` significa que esse valor pertence à classe inteira.
    // Então todos os carros compartilham o mesmo limite de velocidade.
    private static double velocidadeLimite = 250;

    // O construtor serve para inicializar os dados individuais de cada carro.
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Esse método imprime os dados do carro atual.
    // O limite é mostrado com `Carro.velocidadeLimite` porque ele pertence à classe.
    public void imprime(){
        System.out.println("-------------------------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    // Método estático para alterar o limite de velocidade de todos os carros.
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    // Método estático para consultar o limite compartilhado da classe.
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }
}
