package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Biblioteca {
    private String[] nomes;

    public Biblioteca(String[] nome) {
        this.nomes = nomes;
    }



    public void listarLivros(){
        System.out.println("Livros disponiveis na biblioteca: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }


    public void buscarPorAutor(String nome){
        System.out.println("Buscando livros do autor: " + nome);
        for (String nomeLivro : nomes) {
            if(nomeLivro.contains(nome)){
                System.out.println(nomeLivro);
            }
        }
    }
}
