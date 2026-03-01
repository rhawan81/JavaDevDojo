package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
      int[] numeros3 = {1,2,3,4,5}; // forma de iniciar o array sem precisa passar o espaço para ser amazenado na memoria

//        for (int i = 0; i < numeros.length; i++) {
//
//            System.out.println(numeros[i]);
//
//        }
        for(int num : numeros3){ // uma forma de iterar por numeros do mesmo tipo primitivo
            System.out.println(num);
        }

    }
}
