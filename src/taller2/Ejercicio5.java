
package taller2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double acumSueldoA=0,acumSueldoB=0,acumSueldoC=0;
        int cantSueldoA=0,cantSueldoB=0,cantSueldoC=0;
        int cantEmp10K,cantEmp5A,cantFA85K;
        int cantEmp10A6K;
        int cantEmpC125K;
        int codigo,ant,n;
        String categoria,sexo;
        double sueldo;
        
        System.out.println("Cantidad de empleados: ");
        n=sc.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.println("Empleado # "+i);
            System.out.print("Código: ");
            codigo=sc.nextInt();
            System.out.print("Categoria (A/B/C): ");
            categoria=sc.next();
            System.out.print("Sueldo: ");
            sueldo=sc.nextDouble();
            System.out.print("Antieguedad: ");
            ant=sc.nextInt();
            System.out.print("Sexo (F/M): ");
            sexo=sc.next();
            switch (categoria.toUpperCase()){
                case "A":
                    acumSueldoA+=sueldo;
                    cantSueldoA++;
                    break;
                case "B":
                    acumSueldoB+=sueldo;
                    cantSueldoB++;
                    break;
                case "C":
                    acumSueldoC+=sueldo;
                    cantSueldoC++;
                    break;
                default:
                    System.out.println("Error en categoría");
                    
            }
            
        }
        System.out.println("Promedio Sueldos Cat A: "+(acumSueldoA/cantSueldoA));
        System.out.println("Promedio Sueldos Cat B: "+(acumSueldoB/cantSueldoB));
        System.out.println("Promedio Sueldos Cat C: "+(acumSueldoC/cantSueldoC));
        
        
    }
    
}
