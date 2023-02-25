
package language;
// Escriba un algoritmo que dados los valores X y N, permita calcular X^N. [Hacer con estructura WHILE]

import javax.swing.*;

public class EstructuraWhile {
    public static void main (String args[]){
        double x, p=1;
        int n, i;
        x = Double.parseDouble(
                JOptionPane.showInputDialog("Digite la base: ")
                );
        n = Integer.parseInt(
                JOptionPane.showInputDialog("Digite el exponente: ")
                );



        if (n>=0){

            i=1; //Debo darle valor a la variable que va a servir como contador antes de entrar al bucle.

            while(i<=n){
                p*=x;
                i++; //Aquí modifico el contador porque sino entonces me quedaría un bucle infinito.
            }
        }

        else{

            i=-1;

            while(i>=n){
                p*=1/x;
                i--;
            }

        }

        System.out.println("La potencia es = " + p);

        /*Supongamos que el usuario digite como base x=5 y como exponente n=2, entonces el resultado que debe mostrar en pantalla es: La potencia es = 25
         * Supongamos que el usuario digite como base x=5 y como exponente n=-2, entonces el resultado que debe mostrar en pantalla es: La potencia es 0.04
         */

    }
} //fin del programa
