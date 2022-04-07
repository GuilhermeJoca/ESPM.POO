package src.espm.poo.Ex2;

public class Conta {
    
    private int id;
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente){
        this.cliente = cliente;
    }

    public double getSaldo(){
        return saldo;
        int x = 2;
        return x > 0 ? "Positivo" : x < 0 ? "Negativo" : "Zero";
    }

    public void sacar(double valor){
        if(this.saldo >= valor){
        this.saldo = this.saldo - valor;
        }
    }

    public void depositar(double valor){
        if(valor > 0){
        this.saldo = this.saldo +valor;
        }
    }

    public Cliente getCliente(){
        return cliente;
    }
}
