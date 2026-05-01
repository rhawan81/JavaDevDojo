package micheldevDojo.Java_dev_Dojo.javacore.Fmodificadorestaticos.dominio;

public class Anime {
    private String nome;
    private static int [] episodios ;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe.
     // bloco de inicialização de instancia
     // 1 -  alocado espaço em memoria pro objeto
    // 2- cada atributo de classe e criado e inicialização com valores default ou quer for passado
    // 3- Bloco de inicializaçao é executado
    // 4 - Construtor é inicializado
    static {
        System.out.println("Bloco de inicialização  estatico 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i + 1;
        }
    }
    static{
        System.out.println("Bloco de inicialização  estatico 2");
    }

    static{
        System.out.println("Bloco de inicialização  estatico 3");
    }
    {
        System.out.println("dentro do bloco de inicialização Nao estatico");
    }


    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    // faremos desse jeito;
    public Anime() {
        // criaremos um array de episodios e passaremos o valor dentro dele confira abaixo:
       for( int ep : Anime.episodios){
           System.out.print("Episodio "+ ep + " ");
        }
      System.out.println();


    }
}
