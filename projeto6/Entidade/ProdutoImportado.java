
package Entidade;

import java.text.NumberFormat;


public class ProdutoImportado extends Produtos{
   
    private double taxaAlfandegaria; 

    
    public ProdutoImportado(String nome, double preco, double taxaAlfandegaria) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public double precoTotal(){
        return +getPreco() + taxaAlfandegaria;
    }
    
    public String precoVenda(){
        return getNome() + " "+ NumberFormat.getCurrencyInstance().format(precoTotal()) + "(taxa alfandegaria "+
                NumberFormat.getCurrencyInstance().format(taxaAlfandegaria)+ " )";
    } 
}
