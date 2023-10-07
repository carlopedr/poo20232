package poo.bicicleta2;

public class BicicletaMontana extends Bicicleta{
    private int suspension;

    public BicicletaMontana(int suspension, int velocidadActual, int platoActual, int pinonActual) {
        super(velocidadActual, platoActual, pinonActual);
        this.suspension = suspension;
    }

    public BicicletaMontana() {
    }

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }
    
    @Override
    public void acelerar(){
        int va=this.getVelocidadActual()*3;
        this.setVelocidadActual(va);
        //this.velocidadActual*=3;
    }

    @Override
    public String toString() {
        return "BicicletaMontana{"+ super.toString() + "suspension=" + suspension + '}';
    }
    
    
    
}
