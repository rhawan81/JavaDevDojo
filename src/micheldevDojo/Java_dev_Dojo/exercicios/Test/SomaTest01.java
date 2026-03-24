package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Soma;

public class SomaTest01 {
    public static void main(String[] args) {
        Soma soma = new Soma();
        int resposta = soma.somar(2,5);
        int maior = Soma.maior(2,9);
        System.out.println(resposta);
        System.out.println(maior    );
    }
}
