
package poo.persona;

public class Test {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro",20,"123456789");
        Persona p2 = new Persona("María",16,"023456789");
        Persona p3 = new Persona("Pedro",68,"1234567890");
        
        System.out.println("P1:"+p1.toString());
        p1.esMayorDeEdad();
        p2.esMayorDeEdad();
        p3.esMayorDeEdad();
        
        System.out.println("Hace cuanto es mayor de edad P1: "+p1.cuantoHaceMayorEdad());
        System.out.println("Hace cuanto es mayor de edad P2: "+p2.cuantoHaceMayorEdad());
        System.out.println("Hace cuanto es mayor de edad P3: "+p3.cuantoHaceMayorEdad());
        
        System.out.println("Asigna DNI p2:"+p2.asignarDNI("ASDFGHJKL"));
        System.out.println("P2:"+p2.toString());
        System.out.println("Asigna DNI p3:"+p3.asignarDNI("1234"));
        System.out.println("P3:"+p3.toString());
        
        System.out.println("Esta jubilado p2: "+p2.estaJubilado());
        System.out.println("Esta jubilado p3: "+p3.estaJubilado());
    }
}
