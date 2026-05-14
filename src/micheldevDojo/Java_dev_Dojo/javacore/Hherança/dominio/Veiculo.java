package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Veiculo {
    private String marca;
    private String modelo;
    private String ano;
    private int velocidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public int setVelocidade(int velocidade){
        this.velocidade = velocidade;
        return velocidade;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mover(){
        System.out.println("O veiculo esta se movendo......");
    }
}
