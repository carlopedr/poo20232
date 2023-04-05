
package poo;

public class TestCoche {
    public static void main(String[] args) {
        Coche c1=new Coche(4,"BMW","Negro");
        System.out.println(c1.toString());
        System.out.println(c1.getColor());
        c1.setColor("Amarillo");
        System.out.println(c1.getColor());
        
        Coche c2 = new Coche(2,"MB","Rojo",100);
        System.out.println(c2.toString());
        c2.id=200;
        System.out.println(c2.toString());
        c2.pintar("Dorado");
        System.out.println(c2.toString());
        
    }
    
}
