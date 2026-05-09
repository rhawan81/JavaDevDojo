package micheldevDojo.Java_dev_Dojo.exercicios.Test;

public class ArraysTest01 {
    public static void main(String[] args) {
        int [] numeros = {10,20,40,50,70};
        int MaiorNum = numeros[0];
        for (int numero : numeros) {
            if(numero > MaiorNum){
                MaiorNum = numero;

            }


        }
        System.out.println("Maior numero é: " + MaiorNum);


    }
}
