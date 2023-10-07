
package poo.bicicleta2;

public class Bicicleta extends Vehiculo{
    //Estado: atributos
    //private int velocidadActual;
    private int platoActual;
    private int pinonActual;
    //public final static int NUMRUEDAS=2;
    
    //Constructor

    public Bicicleta(int platoActual, int pinonActual, int velocidadActual) {
        super(velocidadActual);
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }
    

    public Bicicleta() {
        //this.velocidadActual=0;
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
        super.setVelocidadActual(super.getVelocidadActual()*2);
        //this.velocidadActual*=2;
    }
    
    @Override
    public void frenar(){
        super.setVelocidadActual(super.getVelocidadActual()/2);
        //this.velocidadActual/=2;
    }
    
    public void cambiarPlato(int plato){
        this.platoActual=plato;
    }
    
    public void cambiarPinon(int pinon){
        this.pinonActual=pinon;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "velocidadActual=" + super.getVelocidadActual() + ", platoActual=" + platoActual + ", pinonActual=" + pinonActual + '}';
    }

    

    
    

    
}
