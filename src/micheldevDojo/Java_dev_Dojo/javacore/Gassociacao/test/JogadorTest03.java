package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.test;

import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Jogador;
import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Michel");
        Jogador jogador2 = new Jogador("Lucas");
        Jogador jogador3 = new Jogador("Mauro");

        Time time1 = new Time(" Flamengo");
        Time time2 = new Time(" Real");
        Time time3 = new Time(" Santos");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        jogador1.setTime(time1);
        jogador2.setTime(time2);
        jogador3.setTime(time3);
        time1.setJogadores(jogadores);
        System.out.println(" --- Jogador ---");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();


    }

}
