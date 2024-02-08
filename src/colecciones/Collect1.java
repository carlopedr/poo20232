package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collect1 {

    public static void main(String[] args) {
        List<String> miArrayList = new ArrayList<>(); // CREAMOS un ArratList
        miArrayList.add("HOLA"); // AÑADIMOS varios elementos al ArrayList
        miArrayList.add("ADIOS");
        miArrayList.add("BUENAS");
        miArrayList.add("HELLO");
        miArrayList.add("CIAO");
        
        miArrayList.set(2, "HALLO"); //SUSTITUIMOS el valor de posicion 2 por otro nuevo
        System.out.println("Tam: " + miArrayList.size()); // CONSULTAMOS que TAMAÑO tiene
        miArrayList.remove(1); // ELIMINAMOS el elemento que esta en la posición 2
        miArrayList.remove("HELLO"); // ELIMINAMOS el elemento con valor "HELLO"
        for (String mistr : miArrayList) {
            System.out.println(mistr);
        }
// Solo la primera ocurrencia que haya "HELLO"
        System.out.println(miArrayList.get(2)); // OBTENEMOS el VALOR del elemento de la posicion 3
        System.out.println("Recorrido con for normal");
        for (int i = 0; i < miArrayList.size(); i++) { // RECORREMOS el ArrayList para ver sus valores:
            String cadaelemento = miArrayList.get(i); // Modo bucle normal
            System.out.println(cadaelemento);
        }
        System.out.println("Recorrido con for each");
        for (String cadaelemento : miArrayList) { // RECORREMOS el ArrayList para ver sus valores:
            System.out.println(cadaelemento); // Modo bucle for-each
        }
        boolean esta = miArrayList.contains("ADIOS");
        // COMPROBAMOS si existe un valor en el arraylist
        System.out.println("Esta: " + esta);
        miArrayList.clear(); // BORRAMOS TODOS los elementos del arraylist
        System.out.println("Despues de clear");
        for (String cadaelemento : miArrayList) { // RECORREMOS el ArrayList para ver sus valores:
            System.out.println(cadaelemento); // Modo bucle for-each
        }

        Iterator<String> it = miArrayList.iterator(); // ITERATOR: crear un iteraror
        while (it.hasNext()) { // recorrer un iteraror con un bucle
            String s = it.next(); // extraer elemento dentro del bucle
            if (s.startsWith("P")) {
                it.remove(); // eliminar el elemento que actualmente se esta iterando
            }
        }
    }

}
