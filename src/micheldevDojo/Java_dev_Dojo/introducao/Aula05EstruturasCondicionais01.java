package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args){

        int idade = 18;
        boolean isAutorizadoAcomprarBebida = idade >= 18;
        if(isAutorizadoAcomprarBebida){
            System.out.println("Permitido a venda ");
        }

        else{
            System.out.println("Idade insuficiente para comprar");
        }


    }
}