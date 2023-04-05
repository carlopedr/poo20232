
package poo;


public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(int numPuertas, String marca, String color) {
        super(marca, color);
        this.numPuertas = numPuertas;
    }

    public Coche(int numPuertas, String marca, String color, int id) {
        super(marca, color, id);
        this.numPuertas = numPuertas;
    }
    
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+" Coche{" + "numPuertas=" + numPuertas + '}';
    }
    
    @Override
    public void pintar(String colorNuevo){
        this.setColor(colorNuevo + " techo negro");
    }
    
    
    
}
