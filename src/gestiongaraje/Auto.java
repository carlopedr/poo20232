/*
Crear clase Auto que hereda de Vehiculo. Esta clase tiene además los atributos:
 boolean tieneRadio, que se asigna en el constructor
 boolean tieneNavegador, que se asigna en el constructor
Además, para un coche, el impuestoCirculacion se incrementa en
o	un 1% más al precio de la cuota normal de vehículo si tiene radio
o	un 2% más al precio de la cuota normal de vehículo si tiene navegador
El atributo cuotaMesGarage se aumenta en 20 % si la cilindrada del coche es mayor de 2999.


*/
package gestiongaraje;

public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(boolean tieneRadio, boolean tieneNavegador, String matricula, String marca, double precio, int cilindrada) {
        super(matricula, marca, precio, cilindrada);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        this.calcularImpuestoCirculacion();
        
        if(super.getCilindrada()>2999){
            super.setCuotaMesGaraje(super.getCuotaMesGaraje()*1.2);
        }
        
    }

    public Auto() {
    }
 
    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

    public boolean isTieneNavegador() {
        return tieneNavegador;
    }

    public void setTieneNavegador(boolean tieneNavegador) {
        this.tieneNavegador = tieneNavegador;
    }
    
    @Override
    public void calcularImpuestoCirculacion(){
        double impuestoCirculacion=super.getPrecio()*0.02;
        double inc=0;
        //2% si tiene radio
        if(this.tieneRadio){
            inc += impuestoCirculacion*0.01;
        }
        //3% si tiene navegador
        if(this.tieneNavegador){
            inc+=impuestoCirculacion*0.02;
        }
        super.setImpuestoCirculacion(impuestoCirculacion+inc);
        
    }

    @Override
    public String toString() {
        return "Auto{" + "tieneRadio=" + tieneRadio + ", tieneNavegador=" + tieneNavegador + '}' + super.toString();
    }
    
    
    
}
