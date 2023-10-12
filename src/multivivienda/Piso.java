package multivivienda;

public class Piso extends Vivienda  {
    private int planta;
    private int puerta;

    public Piso(int planta, int puerta, String calle, int superficieEnMetros) {
        super(calle, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return super.toString()+" Piso{" + "planta=" + planta + ", puerta=" + puerta + '}';
    }

    @Override
    public double impuestoMunicipal() {
        return super.getPrecio()*0.05;
    }

    
    
    
}
