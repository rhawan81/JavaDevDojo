package micheldevDojo.Java_dev_Dojo.introducao.Exercicios;

public class ExercicioMatriz02 {
    public static void main(String[] args) {

        int[][] matriz = {
                {3, 7, 2},
                {9, 1, 5},
                {4, 8, 6}
        };
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior =0;
        int soma = 0;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j){  // fazemos a soma da linha principal da matriz
                    soma += matriz[i][j];
                }

                if(i + j == matriz.length - 1){ /// faço a soma da linha secundaria e pegamos o tamnaho da matriz e dimunuimos -1
                    soma += matriz[i][j];

                }

                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;

                } else if (matriz[i][j] < menor) {
                    menor = matriz[i][j];


                }

            }

        }
        System.out.println(maior);


        System.out.println(linhaMaior);
        System.out.println(colunaMaior);
        System.out.println(soma);
    }
}
