package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio;

public class Estoque {
    private String nome;
    private int quantidadeProduto;
    private Produto[] produtos;

    public Estoque( int quantidadeProduto) {

        this.quantidadeProduto = quantidadeProduto;
    }
    public void relatioDeProdutos(){
       for(Produto  p : produtos){
           if(p == null) continue;
           System.out.println("Produto: " + p.getNome());
           System.out.println("Valor do Produto:" + p.getValorProduto());
           System.out.println(" ------------------------------------------ ");
       }
    }
    public String buscaProduto(String nome){
        for(Produto prod : produtos){

            if(prod == null) continue;
            if(nome.equals(prod.getNome())){
                return "Produto: " + prod.getNome() + " || "+" Valor : "+  prod.getValorProduto();
            }




        }
        return "Produto não encontrado";
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estoque(Produto[] produtos, int quantidadeProduto) {

        this.produtos = produtos;
        this.quantidadeProduto = quantidadeProduto;
    }


    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
}
