package Atividades.projeto1;







public class Estudante {
   String nome; 
   int idade;
   char sexo;
   float media;

   public Estudante(String nome, int idade,char sexo, float media ) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
    this.media = media;
   } 
   public void imprimir() {
       
    System.out.println("Dados do aluno");
    System.out.println("Nome do aluno: " +nome);
    System.out.println("Idade do aluno: " +idade);
    System.out.println("Sexo do aluno: " +sexo);
    System.out.println("A média do aluno: " +media);


   }
   public void alterar(String nm){
      this.nome = nm;  
      System.out.println("O nome foi alterado com sucesso");
   } 
   public void verificar() {
    if(this.media >= 6)
    System.out.println("O aluno " + this.nome +" foi aprovado");
    else
    System.out.println("O aluno " + this.nome +"foi reprovado");
   }
  
  


  





}
