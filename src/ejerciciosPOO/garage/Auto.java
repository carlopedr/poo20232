package ejerciciosPOO.garage;

public class Auto extends Vehiculo{
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(boolean tieneRadio, boolean tieneNavegador, String marca, double precio, int cilindrada) {
        super(marca, precio, cilindrada);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
    }

    @Override
    public String toString() {
        return super.toString()+" Auto{" + "tieneRadio=" + tieneRadio + ", tieneNavegador=" + tieneNavegador + '}';
    }
    

}
