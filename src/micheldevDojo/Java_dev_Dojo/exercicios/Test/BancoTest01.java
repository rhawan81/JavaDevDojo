package micheldevDojo.Java_dev_Dojo.exercicios.Test;

import micheldevDojo.Java_dev_Dojo.exercicios.Dominio.ContaBancaria;

public class BancoTest01 {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Santos";
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
