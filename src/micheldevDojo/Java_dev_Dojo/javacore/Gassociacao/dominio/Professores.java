package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminarios[] seminarios;

    public Professores(String nome, Seminarios[] seminarios, String especialidade) {
        this.nome = nome;
        this.seminarios = seminarios;
        this.especialidade = especialidade;
    }

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Professores(String nome) {
        this.nome = nome;
    }
    public void relatorio(){
        System.out.println("-----");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(especialidade == null) return;
        if(seminarios==null) return;
        System.out.println();
        System.out.println("----- Seminarios Cadastrados -----");
        for( Seminarios seminario: this.seminarios){
            System.out.println("Seminário: " + seminario.getTitulo());
            System.out.println("Local " + seminario.getLocal().getEndereco());
            if(seminario.getAlunos()==null) continue;
            System.out.println("--------- Alunos ");
            for(Alunos aluno: seminario.getAlunos()){
                System.out.println("Aluno:"+ aluno.getNome());
            }
        }


    }
}
