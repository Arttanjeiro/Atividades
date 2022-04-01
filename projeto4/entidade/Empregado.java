package projeto4.entidade;

public class Empregado {
    String nome;
    double salario , imposto , aumento;
    public Empregado(String nome, double salario, double imposto , double aumento) {
        this.nome = nome;
        this.salario = salario;
        this.imposto = imposto;
        this.aumento = aumento;
    }
   
        public double salariolquido() {
            double x = (this.salario * this.imposto) - this.salario;
            System.out.println("Seu salario liquido é de : " +x);
            return this.salario = x;

        
        }
        public void aumento(){
       
            double y = (this.salario *(this.aumento/100) + this.salario);
            System.out.println("Seu salario com aumento é de: " +y);
           this.salario  = y;
        }
        public void cacularImposto(){
            if (this. salario <= 2000) {
               this. imposto = 10/100;
                
            }else            if (this.salario > 2000 && this.salario < 5000) {
                   this. imposto = 15/100;
    
                    
                }else if (this.salario > 5000) {
                   this. imposto = 25/100;
                    
                }
    
            }
        public  void imprimir(){
            System.out.println("Dados do Empregado");
            System.out.println("Nome: " +this.nome);
            System.out.println("Salario: " +this.salario);
            //return nome;


        }

        
       
    }
   


    

