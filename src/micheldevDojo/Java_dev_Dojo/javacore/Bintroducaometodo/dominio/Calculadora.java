package micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }


    public void subtracaoDoisNumeros(){

        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double  divideDoisNumeros(double num1 , double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;

    }

    public double  divideDoisNumeros02(double num1 , double num2){
        if(num2 != 0){
            return 0;
        }
        System.out.println(" Nao existe divisao por zero ");
        return 0;
    }

    public void imprimaDivisao(double num1, double num2){
        if(num2 == 0){
            System.out.println(" Nao existe divisao por zero !");
        }
        System.out.println(num1 /num2);
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println(" dentro do alteraDoisNumeros");
        System.out.println(" Num1: " + num1);
        System.out.println(" Num2: " + num2);
    }
}


