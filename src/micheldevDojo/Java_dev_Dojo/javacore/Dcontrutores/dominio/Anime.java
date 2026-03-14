package micheldevDojo.Java_dev_Dojo.javacore.Dcontrutores.dominio;

public class Anime {

        private String nome;
        private String tipo;
        private int episodios;
        private String genero;


        public Anime(String nome){
            System.out.println(" DENTRO DO CONSTRUTOR !!!!!!!");
            this.nome = nome;
        }

        public void init(String nome, String tipo, int episodios) {
            this.nome = nome;
            this.tipo = tipo;
            this.episodios = episodios;
        }

        public void init(String nome, String tipo, int episodios, String genero) {
            this.init(nome, tipo, episodios);
            this.genero = genero;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public void imprime() {
            System.out.println("Nome: " + this.nome);
            System.out.println("Tipo: " + this.tipo);
            System.out.println("Episodios: " + this.episodios);
            System.out.println("Genero: " + this.genero);
        }


        public void setNome(String nome) {
            this.nome = nome;

        }

        public String getNome() {
            return this.nome;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;

        }

        public void setEpisodios(int episodios) {
            this.episodios = episodios;
        }

        public String getTipo() {
            return this.tipo;
        }

        public int getEpisodios() {
            return this.episodios;
        }

    }


