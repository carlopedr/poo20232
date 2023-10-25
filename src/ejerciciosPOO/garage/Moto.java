package ejerciciosPOO.garage;

public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(boolean tieneSidecar, String marca, double precio, int cilindrada) {
        super(marca, precio, cilindrada);
        this.tieneSidecar = tieneSidecar;
        
        calcularImpuestoCirculacion();
        if (this.tieneSidecar) {
            super.setCuotaMesGarage(CUOTAMESGARAGE * 1.5);
        }
    }

    @Override
    public void setCuotaMesGarage(double cuotaMesGarage) {
        if (cuotaMesGarage <= 0) {
            if (this.tieneSidecar) {
                setCuotaMesGarage(CUOTAMESGARAGE * 1.5);
            } else {
                setCuotaMesGarage(CUOTAMESGARAGE);
            }
        } else {
            if (this.tieneSidecar) {
                setCuotaMesGarage(cuotaMesGarage * 1.5);
            } else {
                setCuotaMesGarage(cuotaMesGarage);
            }
        }
    }

    @Override
    public void calcularImpuestoCirculacion() {
        if (tieneSidecar) {
            setImpuestoCirculacion(getPrecio() * 0.02 * 1.1);
        } else {
            setImpuestoCirculacion(getPrecio() * 0.02);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Moto{" + "tieneSidecar=" + tieneSidecar + '}';
    }

}
