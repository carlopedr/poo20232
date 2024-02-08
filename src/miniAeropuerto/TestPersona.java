
package miniAeropuerto;

import java.util.ArrayList;
import java.util.List;

public class TestPersona {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("123","Pepe",23));
        listaPersonas.add(new Persona("456","Lola",26));
        listaPersonas.add(new Persona("123","Lalo",20));
        System.out.println("Lista completa...");
        for(Persona p:listaPersonas){
            System.out.println(p.toString());
        }
        System.out.println("Nombres...");
        for(int i=0;i<listaPersonas.size();i++){
            System.out.println(listaPersonas.get(i).getNombre());
        }
        
    }
}
