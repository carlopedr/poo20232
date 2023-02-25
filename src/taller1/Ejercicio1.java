/*1.En una serviteca se ha establecido una promoción de las llantas marca “Perilli”, 
dicha promoción consiste en lo siguiente:
•Si se compran menos de cinco llantas el precio es de U$100 cada una.
•El precio es U$75 si se compran de cinco a diez •El precio de U$50 si se compran más de 10.
Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que 
compra y la cantidad que tiene que pagar por el total de la compra.
*/
package taller1;

import java.util.Scanner;

/**
 *
 * @author Carlos Pedraza 20231234567
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int precioLlanta;
        int valorVenta;
        int cantidad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de llantas:");
        cantidad=sc.nextInt();
        if(cantidad<5){
            precioLlanta=100;
        }
        else if(cantidad<=10){
            precioLlanta=75;
        }
        else{
            precioLlanta=50;
        }
        valorVenta=cantidad*precioLlanta;
        System.out.println("Precio de venta: $"+precioLlanta);
        System.out.println("Valor venta: $"+valorVenta);
    }
    
}
