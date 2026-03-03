package micheldevDojo.Java_dev_Dojo.introducao;
public class Aula08ArrayMultiDimensionais02 {
    public static void main(String[] args) {

        // Array simples (1 dimensão) contendo 3 números
        int[] array = {1, 2, 3};

        // Criando uma matriz (array de arrays)
        // Aqui definimos apenas que teremos 3 "linhas",
        // mas ainda não definimos o tamanho de cada linha
        int[][] arrayInt = new int[3][];

        // Primeira linha da matriz recebe um array de tamanho 2
        // Todos os valores começam como 0 (valor padrão de int)
        arrayInt[0] = new int[2];

        // Segunda linha da matriz recebe o array criado anteriormente
        // Ou seja, arrayInt[1] agora aponta para {1,2,3}
        arrayInt[1] = array;

        // Terceira linha recebe um novo array já inicializado
        // com os valores indicados
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        // Loop "for-each" para percorrer cada array dentro da matriz
        // arrayBase representa cada linha da matriz
        for (int[] arrayBase : arrayInt) {

            // Apenas um separador visual no console
            System.out.println("\n-------------------------------");

            // Percorre cada número dentro do array atual
            for (int num : arrayBase) {

                // Imprime cada elemento da linha atual
                System.out.print(num + "");
            }
        }
    }
}
