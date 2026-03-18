package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class Calculadora {
    public int numero;
    public int numero2;
    public int numero3;

// REFATORAÇAÕ USANDO VAR ARGS e fazendo exercicios
// ache o menor numero usando varargs
    public int menorNum(int ... numero){
        int menorNum = numero[0];
        for(int num: numero){
            if(num < menorNum){
                menorNum = num;
            }
        }
        return menorNum;
    }

    public double media(double ... numero){
        double media = 0;
        for (int i = 0; i < numero.length ; i++) {
            media = numero[i] / numero.length;

        }
        return media;
    }
    public void maiorEMenor(int... numeros) {

        if (numeros.length == 0) {
            System.out.println("Nenhum número foi informado");
            return;
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }

    public int contarPares(int ... numeros){
        int contarNums = 0;
        for(int contar: numeros){
            if( contar % 2== 0){
                contarNums++;
            }
        }
        return contarNums;
    }

    public int maior(int ... numero){
        int maior = numero[0];
        for (int i = 0; i < numero.length ; i++) {
            maior = numero[i];
        }
        return maior;
    }

    // metodo valido porem se o input de numeros aumentar eu irei ter que adicionar um por um novamente. ja com o varargs não.
    public int soma(int numero, int numero2){
        return numero + numero2;
    }
    public int soma(int numero , int numero2, int numero3){
        return numero + numero2 + numero3;
    }
  public double soma(double numero , double numero2){
        return numero + numero2;
  }

}
