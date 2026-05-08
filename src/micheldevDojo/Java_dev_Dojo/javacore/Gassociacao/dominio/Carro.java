package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio;

public class Carro {
    private String modelo;
    private String marca;
    private Pessoa pessoa;

    public Carro(Pessoa pessoa, String modelo, String marca) {
        this.pessoa = pessoa;
        this.modelo = modelo;
        this.marca = marca;
    }
    public void imprime(){
        System.out.println("Dono:"+ pessoa.getNome());
        System.out.println("Idade:"+ pessoa.getIdade());
        System.out.println("Modelo:"+ this.modelo);
        System.out.println("Marca:"+ this.marca);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
