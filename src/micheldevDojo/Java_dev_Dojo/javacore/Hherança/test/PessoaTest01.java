package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;

import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Endereco;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Funcionario;

public class PessoaTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jose");
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("12345678");
        funcionario.setNome("Michel");
        funcionario.setCpf("123456789");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1200);
        funcionario.imprime();
    }
}
