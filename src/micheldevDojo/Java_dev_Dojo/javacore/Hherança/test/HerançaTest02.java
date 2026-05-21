package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;

import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Funcionario;

public class HerançaTest02 {

    public static void main(String[] args) {

        // 0 - bloco de inicialização de estatica da super classe e executado quando a JVM carregar a classe pai
        // 1 -bloco de inicialização de estatica da sub classe e executado quando a JVM carregar a classe filha
        // 2 -  alocado espaço em memoria pro objeto da super classe
        // 3- cada atributo da super classe   e criado e inicialização com valores default ou quer for passado da classe pai
        // 4- Bloco de inicializaçao da super classe  é executado na ordem em que aparece
        // 5 - Construtor é executado da superclasse
        // 6 -  alocado espaço em memoria pro objeto da sub classse
        // 7- cada atributo da sub classe   e criado e inicialização com valores default ou quer for passado
        // 8- Bloco de inicializaçao da sub classe  é executado na ordem em que aparece
        // 9- Construtor é executado da subclasse
        Funcionario funcionario = new Funcionario("Jiraya");

    }
}
