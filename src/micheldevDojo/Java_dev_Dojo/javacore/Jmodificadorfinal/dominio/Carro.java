package micheldevDojo.Java_dev_Dojo.javacore.Jmodificadorfinal.dominio;

public class Carro {

    private String nome;
    // CONSTANTE  FINAL NAO PODE TER VALOR ALTERADO E GERALMENTE VEM ACOMPANHADO DO STATIC
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    // Referencia para este objeto nunca poderá ser alterada
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
