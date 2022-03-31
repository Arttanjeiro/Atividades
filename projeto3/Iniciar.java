package Atividades.projeto3;


import java.util.Scanner;

public class Iniciar {
    public static void main(String[] args) {
        Data checkData;
        String dia , mes , ano;

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe uma data: ");
        dia = ler.nextLine();
        System.out.print("Informe um mês: ");
        mes = ler.nextLine();
        System.out.print("Informe um ano: ");
        ano = ler.nextLine();

        ler.close();

        checkData = new Data(dia, mes, ano);
        checkData.validarData();
        if( checkData.validarData() == true)
        checkData.imprimirData();
        else{
            System.out.println("****************************");
            System.out.println("Não foi uma data valida");
        }
    

    }
   
}
