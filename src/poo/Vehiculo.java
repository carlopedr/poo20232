
package poo;

public class Vehiculo {
    private String marca;
    private String color;
    protected int id;

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public Vehiculo(String marca, String color, int id) {
        this.marca = marca;
        this.color = color;
        this.id = id;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", color=" + color + ", id=" + id + '}';
    }

    public void pintar(String colorNuevo){
        this.color=colorNuevo;
    }
    
    
    
}
