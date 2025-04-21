package Exercicio;
public class Conta{
    private double horas_Trabalhadas;
    private double salario_hora;
    private int dependentes;
    
    public Conta(double horas, double salario, int dependentes){
        this.horas_Trabalhadas = horas;
        this.salario_hora = salario;
        this.dependentes = dependentes;
    }
    
    public double salarioBruto(){
        return horas_Trabalhadas * salario_hora + (50 * dependentes);
    }
    
    public double descontoINSS(){
        double salario = salarioBruto();
        double inss = 0;
        if(salario <= 1000){
            inss = salario * 8.5/100;
        }
        else{
            inss = salario * 9/100;
        }
        return inss;
    }
    
    public double descontoIR(){
        double desconto = 0;
        double salario = salarioBruto();
        if(salario  <= 500 ){
            desconto = 0;
        }
        else if(salario > 500 && salario <= 100){
            desconto = salario * 5/100;
        }
        else{
            desconto = salario * 7/100;
        }
        return desconto;
    }
    
    public double salarioLiquido(){
        return salarioBruto() - descontoINSS() - descontoIR();
    }
    
    
}
