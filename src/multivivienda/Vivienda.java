package multivivienda;

public abstract class Vivienda implements IVivienda{
    private String calle;
    private double precio;
    private int superficieEnMetros;

    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getSuperficieEnMetros() {
        return superficieEnMetros;
    }

    public void setSuperficieEnMetros(int superficieEnMetros) {
        this.superficieEnMetros = superficieEnMetros;
    }
    
    public void calcularPrecio(){
        this.precio=this.superficieEnMetros*1000;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "calle=" + calle + ", precio=" + precio + ", superficieEnMetros=" + superficieEnMetros + '}';
    }
    
    @Override
    public void aumentarPrecio(int aumento) {
        this.precio+=aumento;
    }
    
    public abstract double impuestoMunicipal();
}
