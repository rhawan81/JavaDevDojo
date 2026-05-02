package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.test;

import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Jogador;
import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Santos");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
