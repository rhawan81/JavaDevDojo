package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Funcionario extends Pessoa {

    private double salario;


    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de Funcionario 1");
    }



    {
        System.out.println("Dentro do bloco de inicializacao de Funcionario 2");
    }









    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o pagamento de " + this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
