package micheldevDojo.Java_dev_Dojo.javacore.Jmodificadorfinal.dominio;

public class Conta {


    public void depositar(){
        System.out.println("Depositando dinheiro na conta");
    }

    public void sacar(){
        System.out.println("Sacando dinheiro da sua conta !");
    }



    public final void mostrarSaldo(){
        System.out.println("Mostrando o saldo da conta");
    }
}
