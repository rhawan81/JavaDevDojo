package micheldevDojo.Java_dev_Dojo.javacore.Jmodificadorfinal.tests;

import java.util.Scanner;

public class NotasTest01 {

    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 10;
        int n3 = 2;
        int n4 = 3;
        double media  = n1 + n2+ n3+ n4 / 4;

        if(media >= 7){
            System.out.println("Aluno aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado");

        }


    }


















}
