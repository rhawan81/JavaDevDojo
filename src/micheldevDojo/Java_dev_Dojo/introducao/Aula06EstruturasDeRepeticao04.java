package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula06EstruturasDeRepeticao04 {

    // Exercicio dado um valor de um carro descubra em quantas vezes ele pode ser parcelado.
    // condicao é que valorDaParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;

            if(valorParcela < 1000){ // caso o valor da parcela seja maior que 1000 ira parar o comando
               break;
            }
            System.out.println("Parcela "+ parcela + " R$ "+ valorParcela);



        }



    }
}
