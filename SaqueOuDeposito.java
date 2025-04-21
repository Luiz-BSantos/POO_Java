public class SaqueOuDeposito{
    public static void main(String[] args){
        double saque = 700;
        double deposito = 200;
        
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        c1.saque(saque);
        c2.deposito(deposito);
        
    }
}