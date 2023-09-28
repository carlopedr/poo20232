
package poo.bicicleta;

public class BicicletaMontana extends Bicicleta{
    private int suspension;

    public BicicletaMontana(int suspension, int velocidadActual, int platoActual, int pinonActual) {
        super(velocidadActual, platoActual, pinonActual);
        this.suspension = suspension;
    }

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }
    
    public void cambiarSuspension (int suspension){
        this.suspension=suspension;
    }

    @Override
    public void acelerar(){
        int newVelocidadActual=this.getVelocidadActual()*3;
        this.setVelocidadActual(newVelocidadActual);
    }
    
    @Override
    public String toString() {
        return "BicicletaMontana{" + "suspension=" + suspension + '}' + super.toString();
    }
    
    
}
