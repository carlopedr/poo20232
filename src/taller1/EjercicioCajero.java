/*
Desarrolle un programa que simula la extracción de dinero de un cajero. Pide dos números enteros por teclado:
-la cantidad de dinero que hay inicialmente en el cajero
-la cantidad que se desea extraer
Luego hace estos controles y emite estos mensajes:
•Si la cantidad a extraer no es múltiplo de 10, avisa "No es cantidad correcta".
•Si la cantidad que pide es mayor que la que hay en el cajero, dice "No hay dinero suficiente"
•Si la cantidad que se pide es negativa, dice "No es cantidad correcta".
•Si no ocurre ninguno de los errores anteriores, nos indica que cantidad queda en el cajero tras la extracción.

*/
package taller1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioCajero {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int cantidadInicial,cantidadRetiro;
      System.out.print("Ingrese la cantidad inicial:");
      cantidadInicial=input.nextInt();
      System.out.print("Cantidad a retirar:");
      cantidadRetiro=input.nextInt();
      if(cantidadRetiro%10!=0){
          System.out.println("No es cantidad correcta");
      }
      else if(cantidadRetiro>cantidadInicial){
          System.out.println("No hay dinero suficiente");
      }
      else if(cantidadRetiro<0){
          System.out.println("No es cantidad correcta");
      }
      else{
          System.out.println("Cantidad restante en el cajero: "+(cantidadInicial-cantidadRetiro));
      }
        
    }
    
}
