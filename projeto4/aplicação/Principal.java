package Atividades.projeto4.aplicação;

import java.util.Scanner;

import Atividades.projeto4.entidade.Empregado;

public class Principal {
 
    public static void main(String[] args) {
        double salarioBruto ;
        String nome;

        Scanner ler = new Scanner(System.in);

        Empregado emp;

        System.out.print("Digite seu nome: ");
        nome = ler.next();

        System.out.print("Digite seu salario: ");
        salarioBruto = ler.nextDouble();

        emp = new Empregado(nome, salarioBruto);

        System.out.println(emp.imprimir());

        System.out.print("Informe seu percentual de aumento (%): ");
        float perc =  ler.nextFloat();
        emp.aumento(perc);

        System.out.println("Salario apos aumento: " + emp.imprimir());




    
}


}