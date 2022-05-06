package Entidade;

public class Fisica extends Pessoa {
    private double gastosSaude;

    public Fisica(String nome, double ganhoAnual, double gastosSaude) {
        super(nome, ganhoAnual);
        this.gastosSaude = gastosSaude;
    }
	

	public double getGastosSaude() {
		return gastosSaude;
	}


	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}


	@Override
	public double taxa() {
		double gasto;
		if (getGanhoAnual() < 20000.0) {
			gasto = getGanhoAnual() * 0.15;
		}
		else {
			gasto =  getGanhoAnual()* 0.25;
		}
		gasto -= getGastosSaude() * 0.5;
		
        return gasto;

	}

	

    
   
      
     
        
    }


    

    

   
       
   
        
       


    
    

    

