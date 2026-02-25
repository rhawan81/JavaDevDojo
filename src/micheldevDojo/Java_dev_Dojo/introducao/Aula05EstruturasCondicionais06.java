package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
      // Exercicio usando switch Dado os valores de 1 a 7 imprima se é dia util ou final de semana
        // considerando 1 como domingo

        byte dias = 6;  // meu jeito de fazer esta logo abaixo desse codigo agora iremos simplicar, e usar o metodo do dev dojo
        switch (dias){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opção Invalida");
                break;

//        switch (dias){
//            case 1:
//                System.out.println("Domingo");
//                System.out.println("Final de Semana");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                System.out.println("Dia util");
//                break;
//            case 3:
//                System.out.println("Terca");
//                System.out.println("Dia util");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                System.out.println("Dia util");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                System.out.println("Dia util");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                System.out.println("Dia util");
//                break;
//            case 7:
//                System.out.println("Sabado");
//                System.out.println("Final de Semana");
//                break;
        }
    }
}
