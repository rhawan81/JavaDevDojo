package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;


import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Endereco;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Funcionarios2;
import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Gerente;

public class FuncTest01 {
    public static void main(String[]args){
        Funcionarios2 func = new Funcionarios2();
        Gerente gerente = new Gerente();
        Endereco endereco = new Endereco();
        endereco.setRua("Rua tupan");
        endereco.setCep("12345678");
        func.setNome("Michel");
        func.setCpf("123456789");
        func.setSalario(2000);

        gerente.setDepartamento("RH");
        gerente.setNome("Maria");
        gerente.setEndereco(endereco);
        gerente.setCpf("123456789");
        gerente.setSalario(5000);
        func.imprime();
        gerente.imprime();



    }

}
