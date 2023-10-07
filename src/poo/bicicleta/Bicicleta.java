
package poo.bicicleta;

public class Bicicleta extends Vehiculo implements Imprimible{
    //Atributos
    //private int velocidadActual;
    private int platoActual;
    private int pinonActual;
    
    //Constructor

    public Bicicleta(int platoActual, int pinonActual, int velocidadActual) {
        super(velocidadActual);
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }

    public Bicicleta() {
        super.setVelocidadActual(0);
        this.platoActual=1;
        this.pinonActual=1;
    }

    //Métodos set y get

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPinonActual() {
        return pinonActual;
    }

    public void setPinonActual(int pinonActual) {
        this.pinonActual = pinonActual;
    }
        
    //Métodos
    @Override
    public void acelerar(){
        int va=super.getVelocidadActual()*2;
        super.setVelocidadActual(va);
        //this.velocidadActual*=2;
        //this.velocidadActual=this.velocidadActual*2;
    }
    @Override
    public void frenar(){
        //this.velocidadActual/=2;
        int va=super.getVelocidadActual()/2;
        super.setVelocidadActual(va);
    }
    public void cambiarPlato(int plato){
        this.platoActual=plato;
    }
    public void cambiarPlato(){
        this.platoActual=1;
    }
    public void cambiarPinon(int pinon){
        this.pinonActual=pinon;
    }
    public void cambiarPinon(){
        this.pinonActual=1;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "velocidadActual=" + super.getVelocidadActual() + ", platoActual=" + platoActual + ", pinonActual=" + pinonActual + '}';
    }

    @Override
    public void imprime() {
        System.out.println("Imprime Bicicleta{" + "velocidadActual=" + super.getVelocidadActual() + ", platoActual=" + platoActual + ", pinonActual=" + pinonActual);

    }

    
    
    
    
}
