
package poo;

public class Bicicleta {
    private int velocidadActual;
    private int platoActual;
    private int pinonActual;

    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }

    public void acelerar() {
        velocidadActual *= 2;
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

    // getters y setters

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        if(velocidadActual>0)
            this.velocidadActual = velocidadActual;
        else{
            System.out.println("Error en el valor de la velocidad");
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

    
}

