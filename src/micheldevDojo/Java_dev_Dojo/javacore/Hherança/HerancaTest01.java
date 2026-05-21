package micheldevDojo.Java_dev_Dojo.javacore.Hherança;

import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Endereco;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Funcionario;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("12345678");
        Pessoa pessoa = new Pessoa("Michel");

        pessoa.setCpf("123456789");
        pessoa.setEndereco(endereco);


        pessoa.imprime();
        System.out.println("-------------------");
        Funcionario funcionario = new Funcionario("Jose");

        funcionario.setCpf("14290421312");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();

    }
}
