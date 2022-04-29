/*
Trabanho com herança 
*/
package aplicacao;

import Entidade.ProdutoImportado;
import Entidade.ProdutoNovo;
import Entidade.ProdutoUsado;
import Entidade.Produtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        List <Produtos> pr = new ArrayList<>();
        double taxa;
        int ipn=0,ipu=0,ipi=0;
        LocalDate data;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Entre com o número de produtos: ");
        int n = ler.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print("Deseja cadastrar Novo, usado ou importado (n,u,i)? ");
            char op = ler.next().charAt(0);
            ler.nextLine(); //limparbuffer
            System.out.print("Nome: ");
            String nome = ler.nextLine();
            System.out.print("Preço: ");
            double preco = ler.nextDouble();
            
            switch(op){
                case 'n':
                    pr.add(new ProdutoNovo(nome, preco));
                    ipn++;
                    break;
                case 'u':
                    System.out.print("Data fabricação: ");
                    data = LocalDate.parse(ler.next(),formato);
                    pr.add(new ProdutoUsado(nome, preco , data));
                    ipu++;
                    break;
                case 'i':
                    System.out.print("Taxa de importação R$ ");
                    taxa = ler.nextDouble();
                   pr.add(new ProdutoImportado(nome, preco, taxa));
                    ipi++;
                    break;
            }
        } 
        System.out.println("\nPRODUTOS E PREÇOS:");
        System.out.println("****************************************************");
        for (Produtos produtos : pr) {
            System.out.println(produtos.precoVenda());
        }   
   }   
}
