package micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.test;

import micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Michel";
        funcionario.idade = 29;
        funcionario.salarios = new double[]{1200, 987.32, 2000};
       funcionario.imprimaDados();
        funcionario.imprimeMediaSalarial();
    }
}
