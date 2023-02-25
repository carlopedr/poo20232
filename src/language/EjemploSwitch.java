
package language;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú");
        System.out.println("1. Área de un rectángulo");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.print("Ingrese una opción:");
        opcion=sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Opción 1");
                System.out.print("Valor del lado 1: ");
                int lado1 =sc.nextInt();
                System.out.print("Valor del lado 2: ");
                int lado2 =sc.nextInt();
                int area=lado1*lado2;
                System.out.println("Area= "+area);
                break;
            case 2:
                System.out.println("Opción 2");
                break;
            case 3:
                System.out.println("Opción 3");
                break;
            default:
                System.out.println("Opción equivocada");
                
                
        }
        
    }
    
}
