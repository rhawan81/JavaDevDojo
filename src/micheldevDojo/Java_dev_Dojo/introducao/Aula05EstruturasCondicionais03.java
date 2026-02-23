package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro devDojo";
        String mensagemNaoDoar = "Ainda nao tenho condiçoes ,mais vou ter";
        // Operador ternario (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
