package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio;

public class Hospital {
    private String nome;
    private Medico[] medicos;

    public Hospital(String nome, Medico[] medicos) {
        this.nome = nome;
        this.medicos = medicos;
    }

    public void imprime(){
        System.out.println("Hospital : " + this.nome);
        if (medicos == null) return;
        for (Medico medico : medicos) {
            System.out.println("Medico: " + medico.getNome());
            System.out.println("Especialidade: " + medico.getEspecialidade());


        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Hospital(String nome) {
        this.nome = nome;
    }
}
