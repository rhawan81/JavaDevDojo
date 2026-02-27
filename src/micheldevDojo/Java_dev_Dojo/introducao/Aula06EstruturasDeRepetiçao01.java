package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula06EstruturasDeRepetiçao01 {
    public static void main(String[] args) {
        // Estrutura de Repetição do Java While,Do While, for
        int cont = 220;
        while (cont < 10) { // condicao
            cont++;
            System.out.println(cont);

        }
        do { // executa pelo menos 1 vez mesmo sendo falso ou verdadeiro
            System.out.println("Dentro do while");
        } while (cont < 10);
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
