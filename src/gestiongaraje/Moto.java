
package gestiongaraje;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(boolean tieneSidecar, String marca, double precio, int cilindrada) {
        super(marca, precio, cilindrada);
        this.tieneSidecar = tieneSidecar;
        this.calcularImpuestoCirculacion();
        if(this.tieneSidecar){
            super.setCuotaMesGaraje(super.getCuotaMesGaraje()*1.5);
        }
    }
    
    @Override
    public void calcularImpuestoCirculacion(){
        //2% del precio
        if(this.tieneSidecar){
            super.setImpuestoCirculacion((super.getPrecio()*0.02)*1.1);
        }
        else
            super.setImpuestoCirculacion((super.getPrecio()*0.02));
    }

    @Override
    public String toString() {
        return "Moto{" + "tieneSidecar=" + tieneSidecar + "} " +super.toString();
    }
    
    
    
    
}
