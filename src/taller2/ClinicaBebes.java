/*
Una clínica de maternidad necesita un sistema para determinar 
cuántos bebés han nacido recientemente. 
Dicho sistema solicita al usuario capturar la cantidad de 
nacimientos (N), el nombre de cada bebé y su sexo 
(implemente un ciclo do-while para validar la captura, 
siendo M para masculino y F para femenino). 
Al final, debe imprimir la cantidad de bebés de cada sexo.

*/
package taller2;

import java.util.Scanner;

public class ClinicaBebes {
    public static void main(String[] args) {
        int n;
        String nombre;
        String sexo;
        int cantM=0,cantF=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Cantidad de bebes: ");
        n=input.nextInt();
        for(int numBebe=1;numBebe<=n;numBebe++){
            System.out.println("Datos bebe #"+numBebe);
            System.out.print("Nombre:");
            nombre=input.next();
            do {
                System.out.print("Sexo (F/M): ");
                sexo = input.next();
                sexo=sexo.toUpperCase();
            }while(sexo.compareTo("M")!=0 && sexo.compareTo("F")!=0);
            switch(sexo){
                case "M":
                    cantM++;
                    break;
                case "F":
                    cantF++;
                    break;
            }
        }
        System.out.println("Cantidad M: "+ cantM);
        System.out.println("Cantidad F:" + cantF);
    }
}
