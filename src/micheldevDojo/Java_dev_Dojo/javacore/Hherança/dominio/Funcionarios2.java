package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Funcionarios2 extends Pessoa{

    private double salario;




    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Meu salario é " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
