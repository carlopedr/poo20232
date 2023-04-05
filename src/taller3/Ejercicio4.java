
package taller3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double[] notas = new double[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una nota: ");
        double nota=sc.nextDouble();
        for(int i = 0;i<notas.length;i++){
            if(notas[i]==0){
                notas[i]=nota;
                break;
            }
                
        }
        for(double n:notas){
            System.out.println(n);
            
        }
            
    }
    
}
