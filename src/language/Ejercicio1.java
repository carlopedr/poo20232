/*En una serviteca se ha establecido una promoción de las llantas marca “Perilli”, dicha promoción consiste en lo siguiente:
•	Si se compran menos de cinco llantas el precio es de U$100 cada una.
•	El precio es U$75 si se compran de cinco a diez
•	El precio de U$50 si se compran más de 10.

Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra y la que tiene que pagar por el total de la compra.
*/
package language;

import java.util.Scanner;

/**
 *
 * @author Carlos Pedraza 2023123456
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int numLlantas;
        int precioLlanta;
        int valorTotal;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Cantida de llanta a comprar: ");
        numLlantas = sc.nextInt();
        
        if(numLlantas<5){
            precioLlanta=100;
        }
        else if(numLlantas<=10){
            precioLlanta=75;
        }
        else{
            precioLlanta=50;
        }
        valorTotal=precioLlanta*numLlantas;
        System.out.println("Precio de cada llanta: "+ precioLlanta);
        System.out.println("Valor total: "+valorTotal);    
    }
    
}
