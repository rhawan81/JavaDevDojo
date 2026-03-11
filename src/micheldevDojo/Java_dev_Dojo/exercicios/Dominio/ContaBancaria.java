package micheldevDojo.Java_dev_Dojo.exercicios.Dominio;

public class ContaBancaria {
    public String titular;
    public double saldo;



    public void depositar(int valor){
        if(valor <= 0){
            System.out.println("Valor de deposito invalido!");
            return;
        }
        saldo += valor;
        System.out.println("Deposito de : "+valor+ " Foi efetuado com sucesso !");

    }
    public void sacar(int valorSaque){
        if(valorSaque > saldo){
            System.out.println(" Valor insuficiente Para saque , faça um novo deposito");
        }

        else {
            saldo -= valorSaque;
            System.out.println("Voce sacou o valor de: " + valorSaque +"$"+" Com sucesso !");
        }
    }
    public void mostrarSaldo(){
        System.out.println(" Valor Atual em conta é de : "+ saldo+ "$");

    }

}
