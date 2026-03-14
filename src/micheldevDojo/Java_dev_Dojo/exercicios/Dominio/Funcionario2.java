package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Funcionario2 {
    private String nome;
    private int idade;
    private double[] salarios;
    public  double mediaSalarios;


    public void imprimirDados() {
        System.out.println("NOME: " + this.nome);
        System.out.println("Idade : " + this.idade);
        System.out.println("Salarios:");
        for (double salario : this.salarios) {
            System.out.println(salario);

        }
    }

        public void setNome (String nome){
            this.nome = nome;

        }
        public void setIdade ( int idade){
            this.idade = idade;

        }
        public void setSalarios(double[] salario){
            this.salarios = salario;
        }
        public String getNome() {
            return this.nome;
        }
        public int getIdade () {
            return this.idade;
        }

        public void exibirMedia(){
            double soma = 0;
            for (double salario : this.salarios) {
                soma += salario;
            }
            this.mediaSalarios = soma / this.salarios.length;
            System.out.println("Media Salarial: " + this.mediaSalarios);

        }

    }

