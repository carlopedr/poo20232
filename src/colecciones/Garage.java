package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garage implements IGarage {

    private List<Vehiculo> garageVehiculos = new ArrayList<>();

    public List<Vehiculo> getGarageVehiculos() {
        return garageVehiculos;
    }

    public void setGarageVehiculos(List<Vehiculo> garageVehiculos) {
        this.garageVehiculos = garageVehiculos;
    }
    
    @Override
    public double calcularIngresos() {
        double ingresos = 0;
        for (Vehiculo v : garageVehiculos) {
            //if (v != null) {
                ingresos += v.getCuotaMesGarage();
            //}
        }
        return ingresos;
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        int cant = 0;
        for (Vehiculo v1 : garageVehiculos) {
            if (v != null) {
                if (v instanceof Moto) {
                    if (v1 instanceof Moto) {
                        cant++;
                    }
                }
                if (v instanceof Auto) {
                    if (v1 instanceof Auto) {
                        cant++;
                    }
                }
            }
        }
        return cant;
    }
    
    public void agregarVehiculo(Vehiculo v){
        garageVehiculos.add(v);
    }
    
    public void eliminaVehiculo2(Vehiculo v){
        //Usando Iterator
        Iterator<Vehiculo> itV = garageVehiculos.iterator();
        while (itV.hasNext()) {
            //itV.next();
            Vehiculo v1 = itV.next();
            if(v1.equals(v)){
                itV.remove();
            }
            
        }
    }
    
    public void eliminaVehiculo(Vehiculo v){
        for(Vehiculo v1: garageVehiculos){
            if(v1.getMatricula().equals(v.getMatricula())){
                //int pos=garageVehiculos.indexOf(v);
                garageVehiculos.remove(v);
            }
        }
    }
    
    public boolean buscaVehiculo(String matricula){
        for(Vehiculo v : garageVehiculos){
            if(v.getMatricula().equals(matricula))
                return true;
        }
        return false;
    }
    
    public void listarVehiculos(){
        System.out.println("Matricula   Marca   Precio  Cilindros");
        for(Vehiculo v : garageVehiculos){
            System.out.println(v.getMatricula()+"     "+
                    v.getMarca()+"      "+
                    v.getPrecio()+"     "+v.getCilindrada());
            
        }
    }
}
