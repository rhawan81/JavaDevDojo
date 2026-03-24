package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Soma {


    public static int somar(int a, int b) {
        return a + b;
    }

    public static int maior(int... numeros) {
        int maior = numeros[0];
        for (int num : numeros) {
            if (maior > num) {
                maior = num;
            }
        }

        return maior;
    }
}
