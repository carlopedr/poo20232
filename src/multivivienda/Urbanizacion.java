
package multivivienda;

public class Urbanizacion {
    private Vivienda [] predios;

    public Urbanizacion(Vivienda[] predios) {
        this.predios = predios;
    }

    public Vivienda[] getPredios() {
        return predios;
    }

    public void setPredios(Vivienda[] predios) {
        this.predios = predios;
    }
    
    public double sumaPrecios(){
        double acumPrecio=0;
        for(Vivienda v : predios){
            acumPrecio+=v.getPrecio();
        }
        return acumPrecio;
    }
    
    public double sumaChalet(){
        double acumPrecio=0;
        for(Vivienda v : predios){
            if(v instanceof Chalet)
                acumPrecio+=v.getPrecio();
        }
        return acumPrecio;
    }
    
    
}
