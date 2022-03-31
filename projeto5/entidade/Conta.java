package projeto5.entidade;

public class Conta {
    protected int numConta;
    protected String titular;
    protected double saldo;
    public Conta(int numConta, String titular, double saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void saque(double valor){
        if(valor < saldo)
            saldo -= valor;
        else
            System.out.println("Operação negada. Saque maior que saldo.");
    }
    
    public void deposito(double valor){
        saldo +=valor;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }
    @Override
    public String toString() {
        return "ContaCorrente{" + "numeroConta=" + numConta + ", titular=" + titular + ", saldo=" + saldo ;
    }
    public int getNumConta() {
        return numConta;
    }

}
