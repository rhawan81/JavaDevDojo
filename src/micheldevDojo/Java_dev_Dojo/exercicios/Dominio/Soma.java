package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Soma {


    public static int somar(int a, int b) {
        return a + b;
    }

    public static int maior(int... numeros) {
        int maior = numeros[0];
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
        }

        return maior;
    }

    public static double media(double ... numeros) {
        double soma = 0;
        for(double n : numeros){
           soma += n;
        }
        double media = soma / numeros.length;
        return media;
    }

    public static  int contarPares(int ... numeros){
        int pares = 0;
        for(int num : numeros){
            if(num % 2== 0){
                pares++;
            }
        }
        return pares;
    }
}
