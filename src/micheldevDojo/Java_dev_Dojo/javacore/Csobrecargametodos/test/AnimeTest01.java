package micheldevDojo.Java_dev_Dojo.javacore.Csobrecargametodos.test;

import micheldevDojo.Java_dev_Dojo.javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
       anime.init("Naruto", "Manga", 900 , " Ação ");
        anime.imprime();

    }
}
