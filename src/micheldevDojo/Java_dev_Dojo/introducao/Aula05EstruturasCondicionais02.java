package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 21;
        String categoria = ""; // ira substituir exemplo no if abaixo quando imprimir ele ira cair na variavel que esta alocada em memoria o valor do bloco de codigo
        if(idade <= 15){
            categoria = (" Categoria Infantil");
        }
        else if(idade >= 15 && idade < 18){
            categoria = ("Categoria Juvenil");
        }
        else{
            categoria = ("Categoria Adulto");
        }
        System.out.println(categoria);
    }
}
