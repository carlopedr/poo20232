/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EjercicioJuguetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int esferas4 = 0;
        int esferas6 = 0;
        int esferas8 = 0;
        int esferas10 = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de cajas: ");
        int cantidadCajas = input.nextInt();

        for (int i = 1; i <= cantidadCajas; i++) {
            System.out.printf("Ingrese las dimensiones de la caja #%d (en pulgadas):%n", i);
            System.out.print("Ancho: ");
            double ancho = input.nextDouble();
            System.out.print("Alto: ");
            double alto = input.nextDouble();
            System.out.print("Profundidad: ");
            double profundidad = input.nextDouble();

            double diagonal = Math.sqrt(Math.pow(ancho, 2) + Math.pow(alto, 2) + Math.pow(profundidad, 2));

            if (diagonal <= 4) {
                esferas4++;
            } else if (diagonal <= 6) {
                esferas6++;
            } else if (diagonal <= 8) {
                esferas8++;
            } else {
                esferas10++;
            }
        }

        System.out.printf("Cantidad de esferas de 4\": %d%n", esferas4);
        System.out.printf("Cantidad de esferas de 6\": %d%n", esferas6);
        System.out.printf("Cantidad de esferas de 8\": %d%n", esferas8);
        System.out.printf("Cantidad de esferas de 10\": %d%n", esferas10);
    }
}    

