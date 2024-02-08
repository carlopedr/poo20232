
package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Collect2 {
     public static void main(String[] args) {
        ArrayList<String> miArrayList = new ArrayList<>(); // CREAMOS un ArratList
        miArrayList.add("HOLA"); // AÑADIMOS varios elementos al ArrayList
        miArrayList.add("ADIOS");
        miArrayList.add("BUENAS");
        miArrayList.add("HOLA");
        miArrayList.add("CIAO");
        /*
        for(String miStr:miArrayList){
            if(miStr.equals("HOLA")){
                miArrayList.remove("HOLA");
            }
        }*/
        Iterator<String> it = miArrayList.iterator();
        while(it.hasNext()){
            String s = it.next();
            if (s.equals("HOLA"))
                it.remove();
        }
        for(String miStr:miArrayList){
            System.out.println(miStr);
        }
     }
}
