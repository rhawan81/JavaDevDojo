package micheldevDojo.Java_dev_Dojo.javacore.Eblocosinicializacao.test;


import micheldevDojo.Java_dev_Dojo.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
      for( int episodio: anime.getEpisodios()){
          System.out.print(episodio + " ");
      }

    }
}
