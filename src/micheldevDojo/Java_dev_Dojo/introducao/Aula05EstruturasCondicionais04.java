package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double PrimeiraFaixa = 9.70 / 100;
        double SegundaFaixa = 37.35 / 100;
        double TerceiraFaixa = 49.50 / 100;

        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * PrimeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * SegundaFaixa;
        } else {

            valorImposto = salarioAnual * TerceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
