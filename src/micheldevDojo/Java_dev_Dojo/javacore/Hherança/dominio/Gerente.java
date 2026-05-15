package micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio;

public class Gerente extends Funcionarios2{

    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Departamento: " + this.departamento);
    }


}
