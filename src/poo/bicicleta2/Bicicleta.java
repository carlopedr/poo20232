
package poo.bicicleta2;

public class Bicicleta {
    //Estado: atributos
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
    }
    
    public void frenar(){
        this.velocidadActual/=2;
    }
    
    public void cambiarPlato(int plato){
        this.platoActual=plato;
    }
    
    public void cambiarPinon(int pinon){
        this.pinonActual=pinon;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", pinonActual=" + pinonActual + '}';
    }

    

    
    

    
}
