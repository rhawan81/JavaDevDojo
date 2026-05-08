package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.test;

import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Jogador;
import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Michel");
        Time time1 = new Time(" Real Madrid");
        Jogador[] jogadores = {jogador1};

        jogador1.setTime(time1);
        time1.setJogadores(jogadores);
        System.out.println(" --- Jogador ---");
        jogador1.imprime();


    }

}
