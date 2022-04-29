
package Entidade;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


 
public class ProdutoUsado extends Produtos {
   
    public ProdutoUsado(String nome, double preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }



    private LocalDate dataFabricacao;

    
    
    public String precoVenda(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        return getNome() + "(usado) "+NumberFormat.getCurrencyInstance().format(getPreco()) + "(Data de fabricacao: "+dataFabricacao.format(formato) +" )";
    }
}
