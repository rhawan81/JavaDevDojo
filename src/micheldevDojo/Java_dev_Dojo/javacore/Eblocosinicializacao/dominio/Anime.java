package micheldevDojo.Java_dev_Dojo.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int [] episodios = {1,2,3,4,5,6,7,8,9,10,11,12}; // em vez de usarmos esta forma usaremos outra , pois se o anime tivesse 1000 episodios iriamos ter q escrever manualmete 1 por 1;
     // bloco de inicialização de instancia
     // 1 -  alocado espaço em memoria pro objeto
    // 2- cada atributo de classe e criado e inicialização com valores default ou quer for passado
    // 3- Bloco de inicializaçao é executado
    // 4 - Construtor é inicializado
    {
        System.out.println("Bloco de inicialização 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i + 1;
        }
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
//        for( int ep : this.episodios){
//            System.out.print("Episodio "+ ep + " ");
//        }
//        System.out.println();


    }
}
