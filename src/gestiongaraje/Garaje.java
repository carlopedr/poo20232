package gestiongaraje;

public class Garaje implements IGaraje {

    private Vehiculo[] garaje;
    public static final int CAPACIDAD = 50;

    public Garaje() {
        this.garaje = new Vehiculo[CAPACIDAD];
    }

    public Vehiculo[] getGaraje() {
        return garaje;
    }

    public void setGaraje(Vehiculo[] garaje) {
        this.garaje = garaje;
    }

    
    //Debe calcular la suma de ingresos mensuales de todos los vehículos 
    //existentes en el garaje
    @Override
    public double calcularIngresos() {
        double ingresoMes = 0;
        //Aplicando polimorfismos
        for (Vehiculo v : this.garaje) {
            if(v!=null){
                ingresoMes += v.getCuotaMesGaraje();
            }
            
        }
        return ingresoMes;
    }

    //Indica cuantos vehículos hay del tipo  pasado por parámetro en el garaje
    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        int cantidadV = 0;
        for (Vehiculo v1 : garaje) {
            if (v1 != null) {
                if (v1.getClass() == v.getClass()) {
                    cantidadV++;
                }
            }
        }
        return cantidadV;
    }
    
    public void agregarVehiculo(Vehiculo v){
        if (consultarMatriculaGaraje(v.getMatricula())){
            System.out.println("Matricula ya existe en Garaje");
        }
        else {
            for (int i = 0; i < this.garaje.length; i++) {
                if (garaje[i] == null) {
                    garaje[i]=v;
                    break;
                }
            }
        }
        
    }
    
    public void bajarVehiculo(Vehiculo v){
        
    }
    
    public boolean consultarMatriculaGaraje(String matricula){
        boolean res=false;
        for (Vehiculo v : this.garaje) {
            if(v!=null){
                if(v.getMatricula().equals(matricula)){
                    res=true;
                    break;
                }
            }
        }
        return res;
    }
}
