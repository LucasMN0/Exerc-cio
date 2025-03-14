class Motor{
    private int potencia;


    public Motor(int potencia){
        this.potencia = potencia;
    }
    public void funcioanr(){
        System.out.println("O motor está funcionando com uma potência de "+potencia +" cavalos ");
    }
    public int getPotencia(){
        return potencia;
    }
}





class Carro{
    private String modelo;
    private Motor motor;

    public Carro(String modelo, int potenciaDoMotor){
        this.modelo = modelo;
        this.motor = new Motor(potenciaDoMotor);
    }
    public void ligar(){
        System.out.println("Ligando o carro modelo "+modelo +" ... ");
        motor.funcioanr();
    }
    public String getModelo(){
        return modelo;
    }
    public Motor getMotor(){
        return motor;
    }
}
public class Testecarro{
    public static void main(String[] args){
        Carro carro = new Carro("Ferrari",500);
        carro.ligar();
    } 
}
