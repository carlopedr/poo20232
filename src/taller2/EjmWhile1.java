package taller2;

public class EjmWhile1 {

    public static void main(String[] args) {
        int j = 0;
        int i;
        i = 1;
        while (i < 5) {
            j = i * 3 + 10;
            System.out.println("i= " + i + " j= " + j);
            i++;
        }
        System.out.println("i= "+i);

    }

}
