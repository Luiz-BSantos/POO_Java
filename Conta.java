public class Conta{
    double saldo = 8000;
    public void saque(double valor){
        saldo = saldo - valor;
        System.out.println("Valor atual da sua conta: " + saldo);
    }
    public void deposito(double valor){
        saldo = saldo + valor;
        System.out.println("Valor atual da sua conta: " + saldo);
    }
}