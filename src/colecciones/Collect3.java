package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collect3 {

    public static void main(String[] args) {
        List<String> miArrayList = new ArrayList<>(); // CREAMOS un ArratList
        miArrayList.add("HOLA"); // AÑADIMOS varios elementos al ArrayList
        miArrayList.add("ADIOS");
        miArrayList.add("BUENAS");
        miArrayList.add("HELLO");
        miArrayList.add("CIAO");
        for(int i=0;i<miArrayList.size();i++){
            System.out.println(miArrayList.get(i));
        }
        miArrayList.add(2,"BYE");
        System.out.println("Paso 2");
        for(String s : miArrayList){
            System.out.println(s);
        }
        miArrayList.set(1, "HALLO");
        System.out.println("Paso 3");
        for(String s : miArrayList){
            System.out.println(s);
        }
        miArrayList.remove(1); // ELIMINAMOS el elemento que esta en la posición 2
        miArrayList.remove("HELLO"); // ELIMINAMOS el elemento con valor "HELLO"
        System.out.println("Paso 4");
        for(String s : miArrayList){
            System.out.println(s);
        }
        System.out.println("Paso 5");
        for(int i=0;i<miArrayList.size();i++){
            String s =miArrayList.get(i);
            if(s.equals("BYE"))
                miArrayList.remove(i);
        }
        for(String s : miArrayList){
            System.out.println(s);
        }
        boolean esta = miArrayList.contains("BUENAS");
        // COMPROBAMOS si existe un valor en el arraylist
        System.out.println("Esta: " + esta);
        miArrayList.clear(); // BORRAMOS TODOS los elementos del arraylist
        System.out.println("Despues de clear");
        for (String cadaelemento : miArrayList) { // RECORREMOS el ArrayList para ver sus valores:
            System.out.println(cadaelemento); // Modo bucle for-each
        }
    }

}
