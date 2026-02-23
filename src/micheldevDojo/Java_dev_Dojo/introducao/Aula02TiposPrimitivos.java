package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {

        /* guarda em memoria um valor simples
        tipos primitivos = int, double , float , byte , short , long , boolean
         */
        int idade = (int) 100000000000L; // Exemplo de casting ocorre quando eu forço a conversao de um tipo primitivo para outro como exemplo esta linha;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat  = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'm';
        String nome = "Michel"; // Como string é uma classe nao podemos escrever string minusculo pois ira dar erro.
        System.out.println( "a idade é " + idade+ "  anos" );
        System.out.println("Oi meu nome é " + nome );


    }


}
