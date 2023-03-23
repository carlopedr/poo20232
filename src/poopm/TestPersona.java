
package poopm;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre="Pepe";
        //p1.edadJubilacion=62;
        
        Persona p2 = new Persona();
        p2.nombre="Pepa";
        p2.edadJubilacion=57;
        Persona p3 = new Persona();
        p3.edadJubilacion=70;
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
