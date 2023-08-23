/*Programa que pide por teclado al usuario 6 números 
positivos comprendidos entre el 10 y 50, ambos
inclusive. En el caso en el que algún número introducido 
no se encontrara dentro del rango de 10 a 50,
se mostrará un mensaje de error y seguirá pidiendo 
números. El programa finalizará cuando se hayan
introducido 6 números válidos y mostrará el número máximo
introducido de los 6 válidos. Además
indicará cuántos números de los introducidos 
no han sido válidos.
 */
package lang;

import java.util.Scanner;

public class PracticaCiclos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, max = 0, errores = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Ingrese un número entre 10 y 50. Valido "+i+": ");
            numero = sc.nextInt();
            if ((numero >= 10) && (numero <= 50)) {
                if (i == 1) {
                    max = numero;
                }else {
                    if(numero>max){
                        max=numero;
                    }
                }
            }else{
                System.out.println("Número no valido!!");
                errores++;
                i--;
            }

        }
        System.out.println("Máximo:   "+max);
        System.out.println("Errores:  "+errores);
    }
}
