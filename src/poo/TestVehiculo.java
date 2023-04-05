
package poo;

public class TestVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Mazda","Azul");
        System.out.println(v1.toString());
        v1.setColor("Rojo");
        System.out.println(v1.toString());
    }
    
}
