package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.CalculadoraSalario;

public class CalculadoraSalarioTest01 {
    public static void main(String[] args) {
        CalculadoraSalario calcularSalario = new CalculadoraSalario();
        double salario1 = calcularSalario.calcularSalario(2000);
         double salario2 = calcularSalario.calcularSalario(2400, 100);
        double salario3 = calcularSalario.calcularSalario(2000, 400, 100);

        System.out.println("SALARIO NORMAL : "+salario1);
        System.out.println(" Salario com Bonus : "+ salario2);
        System.out.println( " Salario final : "+ salario3);

    }
}
