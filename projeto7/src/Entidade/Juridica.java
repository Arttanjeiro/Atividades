package Entidade;

public class Juridica extends Pessoa{
    private int numEmpresa;

    public Juridica(String nome, double ganhoAnual, int numEmpresa) {
        super(nome, ganhoAnual);
        this.numEmpresa = numEmpresa;
    }
    

    public int getNumEmpresa() {
        return numEmpresa;
    }


    public void setNumEmpresa(int numEmpresa) {
        this.numEmpresa = numEmpresa;
    }


    @Override
    public double taxa() {
        if (numEmpresa> 10) {
			return getGanhoAnual() * 0.14;
		}
		else {
			return getGanhoAnual() * 0.16;
		}
    }

   
    
   
}
