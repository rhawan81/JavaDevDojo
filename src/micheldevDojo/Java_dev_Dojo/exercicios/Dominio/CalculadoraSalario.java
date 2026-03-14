package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class CalculadoraSalario {



    public double calcularSalario(double salario){
        return salario;

    }
    public double calcularSalario(double salario, double bonus){
        double resultado = bonus + salario;
        return resultado;
    }

    public double calcularSalario(double salario , double bonus , double desconto){
        return salario + bonus - desconto;
    }
}
