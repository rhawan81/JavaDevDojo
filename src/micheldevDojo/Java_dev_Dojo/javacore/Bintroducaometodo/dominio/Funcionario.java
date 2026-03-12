package micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;


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
            media += salario;
        }

        media /= salarios.length;
        System.out.println("\nMedia salarial " + media);
    }


}
