package lang;

import java.util.Arrays;

public class Array2 {

    public static void main(String[] args) {
        String[] nombres = {"juan", "pedro", "ana", "maria", "felipe", "luis", "eduardo"};
        Arrays.sort(nombres);
        for (String s : nombres) {
            System.out.println(s);
        }
    }
}
