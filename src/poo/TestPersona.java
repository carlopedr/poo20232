
package poo;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre="Pepe";
        p1.edadJubilacion=62;
        Persona p2 = new Persona();
        p2.nombre="Pepita";
        //p2.edadJubilacion=57;
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        double rnd=Math.random();
        Persona.mensaje();
    }
    
}
