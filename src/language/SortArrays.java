package language;

import java.util.Arrays;
import java.util.Collections;

public class SortArrays {

    public static void main(String[] args) {
        String[] nombres = {"juan", "pedro", "ana", "maria", "felipe", "luis", "eduardo"};
        System.out.println("Orden Ascendente");
        Arrays.sort(nombres);
        //for each
        for (String s : nombres) {
            System.out.println(s);
        }
        System.out.println("Orden Descendente");
        Arrays.sort(nombres,Collections.reverseOrder());
        for (String s : nombres) {
            System.out.println(s);
        }
        
        
    }
}
