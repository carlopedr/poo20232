
package poo.bicicleta;

public class Bicicleta {
    //Atributos
    public int velocidadActual;
    public int platoActual;
    public int pinonActual;
    
    //Constructor
    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
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
