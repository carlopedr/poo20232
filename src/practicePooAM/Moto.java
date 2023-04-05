
package practicePooAM;

public class Moto extends Vehiculo{
    private boolean tieneSidecar;

    public Moto(boolean tieneSidecar, String matricula, String marca, double precio, int cilindrada) {
        super(matricula, marca, precio, cilindrada);
        this.tieneSidecar = tieneSidecar;
        this.calcularImpuestoCirculacion();
        if(tieneSidecar){
            super.setCuotaMesGarage(CUOTAMES*1.5);
        }
    }
    
    @Override
    public void calcularImpuestoCirculacion(){
        //Es el 2% importe del coche
        if(this.tieneSidecar==true){
            super.setImpuestoCirculacion(super.getPrecio()*0.12);
        }
        
    }

    @Override
    public String toString() {
        return super.toString()+" Moto{" + "tieneSidecar=" + tieneSidecar + '}';
    }

    
    
    
    
    
    
    
}
