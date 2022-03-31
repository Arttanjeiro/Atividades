package projeto5.aplicacao;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projeto5.entidade.Conta;
import projeto5.entidade.ContaCorrente;
import projeto5.entidade.ContaPoupanca;


public class Principal {

    static Scanner ler = new Scanner(System.in);
    
    
    public static Conta buscarConta(List <Conta> c, int conta){
        for(Conta cc: c){
            if (conta == cc.getNumConta())
                return cc;
        }
        return null;
    }
    
  
    public static void conta(List <Conta>c, int opd, int op){
       
        int conta;
        
        
        ContaCorrente ct;
        ContaPoupanca cp;
        Conta x;
        
        System.out.println("Listando contas:");
        for(Conta cc: c){
            if(op ==1){
                if(cc instanceof ContaCorrente)
                    System.out.println((ContaCorrente)cc);
            }else{
                if(cc instanceof ContaPoupanca)
                    System.out.println((ContaPoupanca)cc);
            }
         
        }
        
        System.out.print("Conta: ");
        conta = ler.nextInt();
        
        
            if((x = buscarConta(c, conta)) == null){
            System.out.println("Conta inválida.");
            return;
        }
 
        switch(opd){
            case 2:
                System.out.print("Informe valor para saque: ");
            
            
                x.saque(ler.nextDouble());
                break;
            case 3:
                System.out.print("Valor a depositar: ");
                x.deposito(ler.nextDouble());
                break;
            case 4:
            if(x instanceof ContaCorrente){
                    System.out.print("Informe valor para emprestimo: ");
                  ((ContaCorrente)x).emprestimo(ler.nextDouble());
            }else{
                ((ContaPoupanca)x).ganhoMes();
                break;
             
            }
        }
            
    }
   
        
    
    public static void main(String[] args) {
        List <Conta> c = new ArrayList<>();


        String menucc = "1 - Abrir Conta Corrente\n"+
                        "2 - Fazer saque\n"+
                        "3 - Fazer deposito\n"+
                        "4 - Fazer emprestimo\n"+
                        "5 - Listar todas as contas(C/P)\n"+
                        "6 - Sair";
        String menucp = "1 - Abrir Conta Poupança\n"+
                        "2 - Fazer saque\n"+
                        "3 - Fazer deposito\n"+
                        "4 - Simular ganho (30 dias)\n"+
                        "5 - Listar todas as contas(C/P)\n"+
                        "6 - Sair";
        int opd, op;
        int numConta;
        String titular;
        double saldo;
        double limiteEmp;
        double taxaJuros;

        while(true){
            System.out.print("Conta Corrente(1) ou Poupança(2) ou Sair(3): ");
            op = ler.nextInt();
            
            if(op == 3)
                break;
            if(op == 1){
                System.out.println(menucc);
                //contaCorrente();
            }else{
                System.out.println(menucp);
                //contaPoupanca();
            }
            
            System.out.print("Opção: ");
            opd = ler.nextInt();           
            
            if(opd ==1){
                System.out.print("Número da conta: ");
                numConta = ler.nextInt();
                ler.nextLine();
                System.out.print("Titular: ");
                titular = ler.nextLine();
                System.out.print("Saldo Inicial: ");
                saldo = ler.nextDouble();
                if(op == 1){
                    System.out.print("Limite para emprestimo: ");
                    limiteEmp = ler.nextDouble();
                    c.add(new ContaCorrente(numConta, titular,saldo, limiteEmp));
                }else{
                    System.out.print("Taxa de juros mensal: ");
                    taxaJuros = ler.nextDouble();
                    c.add(new ContaPoupanca(numConta, titular, saldo, taxaJuros));
                }
            }else{
                if(opd == 5){
                    if(c.isEmpty())
                        System.out.println("Não existem contas cadastradas.");
                    else
                        for(Conta cc: c)
                        if (cc instanceof ContaCorrente) 
                           System.out.println((ContaCorrente)cc);
                           else
                           System.out.println((ContaPoupanca)cc);


                 
                }else{
                  conta(c,opd,op);
                  
                }
            }
                
        }
    }
    
}
