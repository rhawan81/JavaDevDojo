package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Funcionario2;

public class FuncionarioTest02 {
    public static void main(String[] args) {
            Funcionario2 funcionario = new Funcionario2();

            funcionario.setNome("Michel");
            funcionario.setIdade(20);
            funcionario.setSalarios(new double[]{ 2000, 3000, 2000});
            funcionario.imprimirDados();
            funcionario.exibirMedia();

    }
}
