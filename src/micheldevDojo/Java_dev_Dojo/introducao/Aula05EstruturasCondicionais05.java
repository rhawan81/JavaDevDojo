package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // IMPRIMA O DIA DA SEMANA , considerando 1 como domingo
        byte dia = 5;
        // dentro do switch podemos usar o char, int, byte, short, enum , String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");

                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default: // caso nao funcione ele ira executar esse bloco
                System.out.println("Opção invalida");
                break;
        }
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Sexo Invalido");
        }
    }
}
