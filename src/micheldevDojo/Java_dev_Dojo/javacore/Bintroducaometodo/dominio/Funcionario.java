package micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;


    public void imprimaDados() {
        System.out.println("-------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            System.out.print(salario + " ");
        }

    }

    public void imprimeMediaSalarial() {
        double media = 0;
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            this.media += salario;
        }

        this.media /= salarios.length;
        System.out.println("\nMedia salarial " + this.media);
    }

    public double getMedia() {
        return media;
    }


    public double[] getSalarios() {
        return this.salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
