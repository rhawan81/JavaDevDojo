package micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio;

public class Calculadora {
    // Método que realiza soma simples de dois números hardcoded
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    // Método que realiza a subtração de dois números e imprime o resultado
    public void subtracaoDoisNumeros(){

        System.out.println(21 - 2);
    }

    // Método que recebe dois parâmetros e multiplica seus valores
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    // Método que divide dois números com verificação de divisão por zero - REVISAR LÓGICA
    public double  divideDoisNumeros(double num1 , double num2){
        // Verifica se o divisor é zero para evitar erro
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;

    }

    // REVISAR: Lógica pode estar invertida - se num2 != 0 deveria ser capaz de dividir
    public double  divideDoisNumeros02(double num1 , double num2){
        // Verifica se divisor é diferente de zero - POSSÍVEL ERRO LÓGICO AQUI
        if(num2 != 0){
            return 0;
        }
        System.out.println(" Nao existe divisao por zero ");
        return 0;
    }

    // REVISAR: Possível bug - imprime mesmo quando num2 é zero, causará erro de divisão
    public void imprimaDivisao(double num1, double num2){
        if(num2 == 0){
            System.out.println(" Nao existe divisao por zero !");
        }
        // PROBLEMA: Executa a divisão mesmo quando num2 é zero - deveria ter return
        System.out.println(num1 /num2);
    }
    // REVISAR: Este método demonstra passagem por valor - alterações aqui não afetam o caller
    public void alteraDoisNumeros(int num1, int num2){
        // Atribui novos valores às variáveis locais
        num1 = 99;
        num2 = 33;
        System.out.println(" dentro do alteraDoisNumeros");
        System.out.println(" Num1: " + num1);
        System.out.println(" Num2: " + num2);
    }

    // Método que recebe múltiplos argumentos variáveis (Varargs) e soma todos eles
    public void somaVarArgs(int... numeros){
        // Inicializa variável acumuladora
        int soma = 0;
        // Itera sobre todos os números passados como argumentos
        for(int num : numeros){
            soma += num;
         }
         System.out.println("A soma é : " + soma);
        }
        // Método que recebe um array de inteiros e soma todos os elementos
        public void somaArrays(int[] numeros){
            // Inicializa variável acumuladora
            int soma = 0;
            // Itera sobre cada elemento do array
            for(int num : numeros){
                soma += num;

            }
            // Imprime o resultado da soma usando printf
            System.out.printf("A soma é :  "+ soma);
        }




}



