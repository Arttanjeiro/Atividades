package Entidade;

public abstract  class Pessoa {
    private String nome;
    private double ganhoAnual;
    public Pessoa(String nome, double ganhoAnual) {
        this.nome = nome;
        this.ganhoAnual = ganhoAnual;
        
        }
       
    
     

        public String getNome() {
        return nome;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }




        public double getGanhoAnual() {
            return ganhoAnual;
        }
        public void setGanhoAnual(double ganhoAnual) {
            this.ganhoAnual = ganhoAnual;
        }
       
   


    public abstract double taxa();
        
}
