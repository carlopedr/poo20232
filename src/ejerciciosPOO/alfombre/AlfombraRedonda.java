
package ejerciciosPOO.alfombre;


public class AlfombraRedonda extends Alfombra implements IAlfombras {
    private int radio;

    public AlfombraRedonda(int radio, String color, int precioMetro) {
        super(color, precioMetro);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularSuperficie() {
        return Math.PI*radio*radio;
    }

    @Override
    public double calcularPrecio() {
        return calcularSuperficie()* super.getPrecioMetro();
    }

    @Override
    public double actualizarPrecio() {
        super.setPrecioMetro(super.getPrecioMetro()+2);
        return super.getPrecioMetro();
    }

    @Override
    public double ponerEnRebajas() {
        super.setPrecioMetro(super.getPrecioMetro()/2);
        return super.getPrecioMetro();
    }

    
    
    
    
}
