package Atividades.projeto2;

public class Lampada1 {
    private boolean status;
    public Lampada1(boolean status){
        this.status = status;

    }
    public void acenderLampada(){
        System.out.println("*****************");
        if (status) {
            System.out.println("Lâmpada já esta acesa. ");
            
        }else{
            this.status = true;
            System.out.println("Acesa com sucesso.");

        }
        System.out.println("*****************");
    }
    public void apagarLampanda(){
        if (status) {

            System.out.println("Lâmpada já esta apagada.");
            
        }else{
            this.status = false;
            System.out.println("Apagado com sucesso. ");

        }
        System.out.println("*****************");
    }
    public void imprimirStatus(){
        if (status) {
            this.status = true;
            
        }else{
            this.status = false;
        }
    }
}
