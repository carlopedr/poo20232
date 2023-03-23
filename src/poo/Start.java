
package poo;

import java.util.Scanner;


public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiClaseCoche coche1=new MiClaseCoche();
        coche1.marca="Ferrari";
        coche1.color="Rojo";
        coche1.matricula="AAA123";
        coche1.cilindrada=5000;
        System.out.println("Color: "+coche1.color);
        coche1.cilindrada = coche1.cilindrada + 200 ;
        System.out.println("EL coche tiene como nueva cilindrada "+coche1.cilindrada);
        coche1.color="Negro";
        coche1.dimeSiEsMetalizado();
        System.out.println("Matrícula Actual: "+coche1.matricula);
        //System.out.print("Ingrese la nueva matrícula: ");
        //String matriculaNueva=sc.nextLine();
        //coche1.matricularCoche(matriculaNueva);
        //System.out.println("Matrícula Nueva: "+coche1.matricula);
        boolean rta=coche1.verificarMarca("Ferrari");
        System.out.println("Rta: " + rta);
        
        MiClaseCoche coche2=new MiClaseCoche("BMW","Negro","XYZ890",3000);
        System.out.println("Matrícula Actual Coche2: "+coche2.matricula);
    }
}
