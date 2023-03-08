
package taller1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoEducacion="T";
        float promedio;
        int materiasReprobadas;
        int numCreditos;
        float descuento;
        float totalMatricula, valorDescuento;
        int paqX5;
        
        System.out.print("Tipo de Educación: (T/P) ");
        tipoEducacion=sc.next();
        tipoEducacion=tipoEducacion.toUpperCase();
        //Incluir la validacion del tipoEducación
        switch (tipoEducacion){
            case "T":
                System.out.print("Promedio: ");
                promedio=sc.nextFloat();
                System.out.print("Cantidad de materias reprobadas: ");
                materiasReprobadas=sc.nextInt();
                if(promedio>=9.5){
                    numCreditos=55;
                    descuento=0.25f;
                }
                else if(promedio>=9){
                    numCreditos=50;
                    descuento=0.1f;
                }
                else if(promedio>7){
                    numCreditos=50;
                    descuento=0f;
                }
                else if(materiasReprobadas<=3){
                    numCreditos=45;
                    descuento=0f;
                }
                else{
                    numCreditos=40;
                    descuento=0f;
                }
                if (numCreditos % 5 != 0) {
                    paqX5 = (numCreditos / 5) + 1;
                } else {
                    paqX5 = (numCreditos / 5);
                }
                valorDescuento = (paqX5 * 1800) * descuento;
                totalMatricula = (paqX5 * 1800) - valorDescuento;
                System.out.println("Descuento $:"+valorDescuento);
                System.out.println("Vr. Matricula: $"+totalMatricula);
                break;
            case "P":
                break;
            default:
                System.out.println("Error tipo de educación");
                
                        
        }
        
        
    }
    
}
