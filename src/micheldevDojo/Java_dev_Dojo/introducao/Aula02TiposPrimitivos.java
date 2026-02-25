package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {

        /* guarda em memoria um valor simples
        tipos primitivos = int, double , float , byte , short , long , boolean
         */
        int idade = (int) 100000000000L;     // O mais usado para números inteiros -2bi ate +2bi// Exemplo de casting ocorre quando eu forço a conversao de um tipo primitivo para outro como exemplo esta linha;
        long numeroGrande = 100000; // valido para Inteiro gigante. igual no exemplo
        double salarioDouble = 2000; // Número decimal mais preciso. padrao para decimais
        float salarioFloat  = 2500; // armazena Número decimal (com vírgula).
        byte idadeByte = 10; // Guarda número inteiro pequeno. ex vai de -128 ate 127
        short idadeShort = 10; // Inteiro médio-pequeno vai de -32mil ate 32mil
        boolean verdadeiro = true; // Só guarda verdadeiro ou falso.
        boolean falso = false;
        char caractere = 'm'; // apenas  Guarda UM único caractere.
        String nome = "Michel"; // Como string é uma classe nao podemos escrever string minusculo pois ira dar erro.
        System.out.println( "a idade é " + idade+ "  anos" );
        System.out.println("Oi meu nome é " + nome );


    }


}
