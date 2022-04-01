package projeto4.aplicação;

import projeto4.entidade.Empregado;

public class Principal {
    private static final String Arthur = null;
    private static String A;

    public static void main(String[] args) {
        Empregado x;
        x = new Empregado( Arthur,2500, 25, 23);
        x.imprimir();
        x.aumento();
        x.cacularImposto();
        x.salariolquido();
    }

    
}