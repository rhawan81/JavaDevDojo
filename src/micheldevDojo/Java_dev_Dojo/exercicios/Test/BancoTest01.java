package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.Banco;

public class BancoTest01 {

    public static void main(String[] args) {
        Banco conta = new Banco();
        conta.nome = "Santos";
        conta.saldo = 0;
        conta.depositar(1000);
        conta.mostrarSaldo();
        conta.sacar(500);
        conta.mostrarSaldo();
        conta.depositar(250);
        conta.sacar(700);
        conta.mostrarSaldo();


    }
}
