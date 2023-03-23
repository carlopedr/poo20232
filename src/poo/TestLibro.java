
package poo;

public class TestLibro {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabo",1);
        System.out.println(autor.toString());
        
        Libro libro=new Libro("Cien años de soledad",350,autor);
        System.out.println(libro.toString());
    }
    
}
