package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.Fisica;
import Entidade.Juridica;
import Entidade.Pessoa;

public class Programa {
    

    public static void main(String[] args) {
        List <Pessoa> pes = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
     

        System.out.print("Informe o número de contribuíntes: ");
        int n = ler.nextInt();

        for (int i = 0; i < n;  i++) {
            System.out.print("Dados #"+ n);
            System.out.print("Pessoa Física ou Jurídica? (f/j)");
            char op = ler.next().charAt(0);
            ler.nextLine(); // limpar buffer
            System.out.print(" Nome: ");
            String nome = ler.nextLine();
            System.out.print("Ganhos: ");
            Double ganho = ler.nextDouble();
            switch(op){
                case 'f':
                System.out.print("Despesas com saúde: ");
                Double Despesassaude = ler.nextDouble();
                pes.add(new Fisica(nome, ganho, Despesassaude));
                break;
                case 'j':
                System.out.print("Número de empregados: ");
                Integer empregados = ler.nextInt();
                pes.add(new Juridica(nome, ganho, empregados));
                break;

            }
           
        }
        System.out.println("**************************************");
        System.out.print(" IMPOSTOS PAGOS:");

        for (Pessoa p : pes) {
            System.out.println(p.getNome() + ": $" + String.format("%.2f", p.taxa()));
        }
          System.out.println("****************************");
          double num = 0.0;
          for (Pessoa pessoa : pes) {
              num += pessoa.taxa();
          }  
          System.out.println("TOTAL DE IMPOSTOS: $ " + String.format("%.2f", num));
          ler.close();
       
        
    }

  
}
