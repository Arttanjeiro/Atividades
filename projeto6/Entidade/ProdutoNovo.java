
package Entidade;
import java.text.NumberFormat;

public class ProdutoNovo extends Produtos{
   


    public ProdutoNovo(String nome, double preco) {
        super(nome, preco);
    }

    public String precoVenda(){
        return getNome() +" "+ NumberFormat.getCurrencyInstance().format(getPreco());
    }
    
    
    
    
    
}
