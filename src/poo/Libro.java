
package poo;

public class Libro {
    private String nombre;
    private int numPags;
    private Autor au;

    public Libro(String nombre, int numPags, Autor au) {
        this.nombre = nombre;
        this.numPags = numPags;
        this.au = au;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public Autor getAu() {
        return au;
    }

    public void setAu(Autor au) {
        this.au = au;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", numPags=" + numPags + ", au=" + au + '}';
    }
    
    
    
}
