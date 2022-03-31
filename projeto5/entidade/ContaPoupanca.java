package projeto5.entidade;


public class ContaPoupanca extends Conta {

    
    private double taxaJuros;

   

   

   public ContaPoupanca(int numConta, String titular, double saldo, double taxaJuros) {
        super(numConta, titular, saldo);
        this.taxaJuros = taxaJuros;
    }







@Override
    public String toString() {
        return super.toString()+",taxaJuros" + taxaJuros;
    }

   
    
   
    
  
    
    public void ganhoMes(){
        System.out.printf("Saldo atual: %.2f => Saldo após 30 dias: %.2f\n",
       getSaldo(), (getSaldo() +getSaldo()*taxaJuros/100));
    }
    
    

}
        