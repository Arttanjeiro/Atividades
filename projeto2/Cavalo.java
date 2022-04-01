package projeto2;

public class Cavalo {
    String nome;
    int idade;
    float peso;
    String corCavalo;
    String raca;
    float valor;
    
    public Cavalo(String nome, int idade, float peso, String corCavalo, String raca, float valor) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.corCavalo = corCavalo;
        this.raca = raca;
        this.valor = valor;
    }
    public void descobriRaca() {
        System.out.println("Qual é a raça do cavalo: " +raca);
    }
    public void valorCavalo(){
        System.out.println("Qual o valo do cavalo: " +valor);
    }
    public void mostrarCavalo() {
        System.out.println("****************************************");
        System.out.println("Dados do cavalo");
        System.out.println("Nome do cavalo: " +nome );
        System.out.println("A idade do cavalo: " +idade + " anos ");
        System.out.println("Qual é cor do cavalo: " +corCavalo);
        System.out.println("Qual é peso do cavalo: " +peso);
        System.out.println("Qual é raça do cavalo: " +raca);
        System.out.println("Qual é valor do cavalo: " +valor);


    }
}
