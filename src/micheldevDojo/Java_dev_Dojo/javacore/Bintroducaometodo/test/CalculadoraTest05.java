package micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.test;

import micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        // Instancia um novo objeto da classe Calculadora
        Calculadora calculadora = new Calculadora();
        // Cria um array de inteiros com 5 elementos
        int [] numeros = {1,2,3,4,5};

        // Chama o método somaVarArgs passando múltiplos valores como argumentos variáveis
        calculadora.somaVarArgs(1,3,4,5,7,8,9);
        // Chama o método somaArrays passando o array como argumento
        calculadora.somaArrays(numeros);
    }
}
