package micheldevDojo.Java_dev_Dojo.introducao;

public class exercicios {
    public static void main(String[] args) {

        // Define quantas linhas a pirâmide terá
        int totalLinhas = 5;

        // Loop externo → controla cada linha da pirâmide
        for (int linha = 1; linha <= totalLinhas; linha++) {

            // ===== LOOP DOS ESPAÇOS =====
            // Calcula quantos espaços precisam vir antes das estrelas
            // Fórmula: totalLinhas - linha
            // Isso faz os espaços diminuírem a cada nova linha
            for (int espaco = 1; espaco <= totalLinhas - linha; espaco++) {
                System.out.print(" "); // imprime um espaço sem quebrar linha
            }

            // ===== LOOP DAS ESTRELAS =====
            // Calcula quantas estrelas imprimir na linha atual
            // Fórmula: 2 * linha - 1 → gera sequência: 1,3,5,7,9...
            for (int estrela = 1; estrela <= (2 * linha - 1); estrela++) {
                System.out.print("*"); // imprime estrela na mesma linha
            }

            // Após terminar a linha (espaços + estrelas)
            // quebra a linha para começar a próxima
            System.out.println();
        }
    }
}