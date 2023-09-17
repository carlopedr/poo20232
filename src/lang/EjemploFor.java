package lang;

public class EjemploFor {

    public static void main(String[] args) {
        int i,j;
        for (i = 1, j = i + 10; i <= 5; i++, j = 2 * i) {
            System.out.println("i= " + i + " j= " + j);
        }
        System.out.println("iout= " + i + " jout= " + j);

    }

}
