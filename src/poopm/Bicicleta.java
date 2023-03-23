
package poopm;

public class Bicicleta {
    public int velocidadActual;
    private int platoActual;
    private int pinonActual;

    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }

    public Bicicleta(int platoActual, int pinonActual) {
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }
    
    
    //Getters y Setters
    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        if(velocidadActual>=0)
            this.velocidadActual = velocidadActual;
        else{
            System.out.println("Error en la velocidad");
            this.velocidadActual = 0;
        }
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

    
    
    public void acelerar() {
        velocidadActual *= 2;
    }
    
    public void acelerar(int aceleracion) {
        velocidadActual += aceleracion;
    }

    public void frenar() {
        velocidadActual /= 2;
    }

    public void cambiarPlato(int plato) {
        platoActual = plato;
    }

    public void cambiarPinon(int pinon) {
        pinonActual = pinon;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", pinonActual=" + pinonActual + '}';
    }

    
}
