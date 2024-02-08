
package miniAeropuerto;

import java.util.ArrayList;
import java.util.List;

public class TestAvion {
    public static void main(String[] args) {
        List<Avion> listaAviones=new ArrayList<>();
        listaAviones.add(new Avion("AB320","HGK456",new Persona("234","Sebas", 34)));
        listaAviones.add(new Avion("B737","HGF290",new Persona("1234","Clau", 32)));
        listaAviones.add(new Avion("F45","FGH123",new Persona("098","Pao", 31)));
        for(Avion a:listaAviones){
            System.out.println(a.toString());
        }
        System.out.println("Matriculas...");
        for(Avion a:listaAviones){
            System.out.println(a.getMatricula());
        }
        System.out.println("Nombres pilotos...");
        for(Avion a:listaAviones){
            System.out.println(a.getPiloto().getNombre());
        }
    }
}
