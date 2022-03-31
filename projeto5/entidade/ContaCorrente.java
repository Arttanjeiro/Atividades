package projeto5.entidade;

public class ContaCorrente extends Conta {
  
    private double limiteEmp;

    
    
    
    public ContaCorrente(int numConta, String titular, double saldo, double limiteEmp) {
        super(numConta, titular, saldo);
        this.limiteEmp = limiteEmp;
    }



    @Override
    public String toString() {
        return super.toString() +", limiteEmp=" + limiteEmp;
    }

   
    
    public void emprestimo(double valor){
        if(valor < limiteEmp)
            setSaldo(valor);
        else
            System.out.println("Empréstimo não concedido.");
    }
    
}

    

