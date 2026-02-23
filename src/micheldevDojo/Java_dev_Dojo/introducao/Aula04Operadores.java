package micheldevDojo.Java_dev_Dojo.introducao;

import java.util.Arrays;

public class Aula04Operadores {
    /*
    // + - / *
    operadores
     */
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int soma_total = numero1 + numero2;

        System.out.println("soma dos numero: "+soma_total);
        // Resto divisao %
        // < > <= >== == !=
        // AND NO JAVA É && OU É INSCRITO ||

        int idade = 29;
        float salario = 3500F;


        boolean isDentro_da_lei = idade  > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(" Idade dentro da lei "+isDentro_da_lei);
        System.out.println(" Idade menor que trinta "+isDentroDaLeiMenorQueTrinta);

    }
}
