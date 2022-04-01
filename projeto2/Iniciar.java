/*
Criação de Classes

-> Criação de objetos

-> Implementação de pequenos projetos
*/

package projeto2;

import java.util.Scanner;

public class Iniciar {
    public static void main(String[] args) {
       Cavalo x;

       String nome;
       int idade;
       float peso;
       String corCavalo;
       String raca;
       float valor;
       Scanner ler = new Scanner(System.in);

       System.out.print("Digite nome do cavalo: ");
       nome = ler.nextLine();
       System.out.print("Digite a idade do cavalo: ");
       idade = ler.nextInt();
       System.out.print("Qual é peso do cavalo: ");
       peso = ler.nextInt();
        System.out.print("Qual é cor do cavalo: ");
        ler.nextLine();
        corCavalo = ler.nextLine();
        
        System.out.print("Qual é raça do cavalo: ");
        raca = ler.nextLine();
        
        System.out.print("Qual é valor do cavalo: ");
        valor = ler.nextFloat();
        System.out.println("***************************************");
    
        x = new Cavalo(nome, idade, peso, corCavalo, raca, valor);

        x.descobriRaca();
        x.valorCavalo();
        x.mostrarCavalo();



        
    }
    
}
