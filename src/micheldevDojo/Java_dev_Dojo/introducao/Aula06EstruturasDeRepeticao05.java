package micheldevDojo.Java_dev_Dojo.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // dado o valor de uma moto , descubra em quantas parcelas ela pode ser parcela
        // Parcela tem que >= 1000

        double valorMoto = 37000;
        for (int parcela = (int) valorMoto; parcela >= 1; parcela--) {
            double valorParcela = valorMoto / parcela;
            if (valorParcela < 1000) {
               continue; // caso o valor da parcela seja menor que 1000 ele ira continuar, apos a parcela chega em 1000 programa para.


            }
            System.out.println("PARCELA " + parcela + " R$ " + valorParcela);
        }
    }
}