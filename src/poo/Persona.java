package poo;


public class Persona {
    String nombre;
    static int edadJubilacion;

    public static void mensaje(){
        System.out.println("Uso de un método estatico desde la clase Persona");
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edadJubilacion=" + edadJubilacion + '}';
    }
    
    
    
    
}
