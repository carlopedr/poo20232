package ejerciciosPOO.garage;

public class Garage implements IGarage {

    public static int NHUECOS = 100;
    private Vehiculo[] garageVehiculos = new Vehiculo[NHUECOS];

    public Vehiculo[] getGarageVehiculos() {
        return garageVehiculos;
    }

    public void setGarageVehiculos(Vehiculo[] garageVehiculos) {
        this.garageVehiculos = garageVehiculos;
    }

    
    @Override
    public double calcularIngresos() {
        double ingresos = 0;
        for (Vehiculo v : garageVehiculos) {
            if (v != null) {
                ingresos += v.getCuotaMesGarage();
            }
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
}
