package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float ,double inicializa em 0
        // char '/u0000' gera um ' ' espaço em branco
        // boolean false iremos alocar na memoria 3 false pois nao foi inicializado
        // String null iremos guardar 3 nulll
        // boolean[] idades = new boolean[3];


//        System.out.println(idades[0]);
//        System.out.println(idades[1]);
//        System.out.println(idades[2]);

        String[] nomes = new String[4];

        nomes[0] = "Michel";
        nomes[1] = "jooki";
        nomes[2] = "Mauro";
        nomes[3] = "santos";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }


    }

}
