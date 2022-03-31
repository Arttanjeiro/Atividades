

package Atividades.projeto1;

public class Iniciar {
    public static void main(String[] args) {
        Estudante x;
        x = new Estudante("Arthur",19,'M',7);
        x.imprimir();
        x.alterar("Felipe");
        x.imprimir();
        x.verificar();
    }

    
}