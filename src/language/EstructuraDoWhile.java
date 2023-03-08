
package language;

import javax.swing.*;

public class EstructuraDoWhile {
   public static void main (String args[]){
       double x, p=1;
       int n, i=1;
       x = Double.parseDouble(
               JOptionPane.showInputDialog("Digite la base: ")
               );
       n = Integer.parseInt(
               JOptionPane.showInputDialog("Digite el exponente: ")
               );

       if(n>=0){
           do{
               p*=x;//p=p*x
               i++;
           }while(i<=n);
       }else{
           do{
               p*=1/x;
               i--;
           }while(i>=n);
       }

       System.out.println("La pontencia es: " + p);

        /*Supongamos que el usuario digite como base x=5 y como exponente n=2, entonces el resultado que debe mostrar en pantalla es: La potencia es = 25
         * Supongamos que el usuario digite como base x=5 y como exponente n=-2, entonces el resultado que debe mostrar en pantalla es: La potencia es 0.04
         */

    }
}
