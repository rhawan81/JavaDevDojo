package micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.test;

import micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Michel");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprimaDados();
        funcionario.imprimeMediaSalarial();
        System.out.println(" Media salarial foi de : "+ funcionario.getMedia());

    }
}
