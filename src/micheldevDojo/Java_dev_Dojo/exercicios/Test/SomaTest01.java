package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Soma;

public class SomaTest01 {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Soma maior2 = new Soma();
        int result = maior2.maior(2,9,5,6,3,2,100,42,42,651,2123,412,4);
        int resposta = soma.somar(2,5);
        int qntdPares = soma.contarPares(2,3,4,5,6,7,8,9,10);
        System.out.println(result);
        System.out.println("Quantidade de numeros pares:" + qntdPares);
        soma.relatorio(2,3,4,5,6,7,8,9,10);

    }
}
