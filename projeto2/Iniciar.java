package Atividades.projeto2;

import java.util.Scanner;

public class Iniciar {
    public static void main(String[] args) {
        Lampada1 lp = new Lampada1(false);
        Scanner ler = new Scanner(System.in);


        int op;
        String menu = "0 - Sair do Programa.\n" +
        "1 - Status da lâmpada.\n" +
        "2 - Acender a lâmpanda.\n"+
        "3 - Apagar lâmpanda.\n" +
        "Opção";

        for(;;){
            System.out.println(menu);
            op = ler.nextInt();

            switch (op) {
                case 0:
                System.exit(0);
                case 1 :
                lp.imprimirStatus();
                break;
                case 2:
                lp.acenderLampada();
                break;
                case 3 :
                lp.apagarLampanda();
                break;
                    
                 
            }

        }
    }
    
}
