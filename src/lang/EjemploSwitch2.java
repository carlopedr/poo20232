package lang;

import java.util.Scanner;

public class EjemploSwitch2 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 7: ");
        numero=sc.nextInt();
        switch(numero){
            case 1:
                System.out.println("El número "+ numero + "corresponde al Lunes");
                break;
            case 2:
                System.out.println("El número "+ numero + "corresponde al Martes");
                break;  
            case 3:
                System.out.println("El número "+ numero + "corresponde al Miércoles");
                break;
            default:
                System.out.println("Error número!");
        }
    }
}
