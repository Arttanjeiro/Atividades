package Atividades.projeto4.entidade;

public class Empregado {
    private String nome;
    private double salarioBruto , imposto;
    public Empregado(String nome, double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        cacularImposto();
    }
    public double salarioLiquido(){
        return this.salarioBruto - this.imposto;

    }
    public void aumento (double aum) {
        salarioBruto += salarioBruto * aum/100;
        cacularImposto();

    }
    public String imprimir() {
        return nome +
        String.format(" -> Salário Bruto: R$ %.2f", salarioBruto) + "\n"+
        String.format(" -> Impostos: R$ %.2f", imposto) + "\n"+
        String.format(" -> Salário Liquido: R$ %.2f", salarioLiquido());
    
}


    
    private void cacularImposto() {
        if (salarioBruto <= 2000) {
            imposto = salarioBruto * 0.10;
            
        } else if (salarioBruto <= 5000) {
            imposto = salarioBruto * 0.15;
            
        }else if (salarioBruto > 5000) {
            imposto = salarioBruto * 0.25;
            
        }

    }

    


        
       
    }
   


    

