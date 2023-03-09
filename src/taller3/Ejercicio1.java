/*
Temperaturas. Se piden por teclado la temperatura (entre 10 y 40)
de cada uno 
de los 7 días de una semana y se almacenan en un array de 7 
elementos. Se pide por teclado luego una nueva temperatura, 
y se compara con las leídas anteriormente para decir si tal 
nueva temperatura se dio en algún día de la semana 
(si tal nueva temperatura existe en el array de temperaturas 
de la semana). En caso de que la temperatura exista en el 
arreglo, debe informar en que día o días se dio dicha 
temperatura. 
 */
package taller3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temps[] = new int[7];
        int tempNew;
        String dayName[] = {"Sun", "Mon", "Tus", "Wed", "Thu", "Fri", "Sat"};

        for (int k = 0; k < temps.length; k++) {
            /*
            boolean valid=false;
            while(!valid){
                System.out.print("Temperature day # "+(k+1)+": ");
                temps[k]=sc.nextInt();
                if(temps[k]>=10&&temps[k]<=40)
                    valid=true;
                else
                    System.out.println("Temp not valid. Try again!!");
            }*/
            temps[k] = (int) (Math.random() * 40 + 10);
        }
        System.out.println("#Day    Temp");
        int i = 0;
        for (int t : temps) {
            i++;
            System.out.println(i + "      " + t);
        }
        System.out.print("Temp to search: ");
        tempNew = sc.nextInt();

        for (int k = 0; k < temps.length; k++) {
            if (temps[k] == tempNew) {
                System.out.println(dayName[k]);
            }
        }
        //Copiande el vector original
        int temps1[] = new int[7];
        for (int k = 0; k < temps.length; k++){
            temps1[k]=temps[k];
        }
        //Ordenar vector
        Arrays.sort(temps1);
        System.out.println("Sorting...");
        System.out.println("#Day    Temp");
        i = 0;
        for (int t : temps) {
            i++;
            System.out.println(i + "      " + t + "     " + temps1[(i-1)]);
        }

    }
}
