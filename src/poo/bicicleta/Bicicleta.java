
package poo.bicicleta;

public class Bicicleta {
    //Atributos
    private int velocidadActual;
    private int platoActual;
    private int pinonActual;
    
    //Constructor
    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }

    public Bicicleta() {
        this.velocidadActual=0;
        this.platoActual=1;
        this.pinonActual=1;
    }

    //Métodos set y get

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

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
    public void acelerar(){
        this.velocidadActual*=2;
        //this.velocidadActual=this.velocidadActual*2;
    }
        public void frenar(){
        this.velocidadActual/=2;
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
        return "Bicicleta{" + "velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", pinonActual=" + pinonActual + '}';
    }

    
    
    
    
}
