package Atividades.projeto3;


public class Data {
    String dia , mes , ano;
    
    

    public Data(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public boolean validarData(){
        if (this.dia.length() != 2 || this.mes.length() != 2 || this.ano.length() != 4) 
            return false;
            if (Integer.parseInt(this.dia) > 0 && Integer.parseInt(this.dia) <= 31 && Integer.parseInt(this.mes) > 0 && Integer.parseInt(this.mes) <= 12 && Integer.parseInt(this.ano) > 0) 
             return true;
                
                
            else
                return false;
            
           
            
        
        
    }
    public void imprimirData() {
        System.out.println("*********************");
        System.out.println("Data é valida " + this.dia + "/" + this.mes + "/" + this.ano );
        
    }
    


    
  
     

    

    
}
