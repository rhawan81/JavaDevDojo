package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import java.util.Scanner;

public class TestParImpar01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber se ele é par ou impar");
        int i = sc.nextInt();
        if(i % 2 == 0){
            System.out.println("O numero é par");
        }
        else{
            System.out.println("O numero é impar");
        }
        sc.close();
    }
}
