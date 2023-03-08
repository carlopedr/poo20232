package taller1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioTombola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //La balota1 es para el color: 
        //1 - Amarillo
        //2 - Azul
        //3 - Rojo
        int balota1,balota2;
        String premio;
        System.out.println("Seleccione es color de la primera balota:");
        System.out.println("1 - Amarillo");
        System.out.println("2 - Azul");
        System.out.println("3 - Rojo");
        System.out.print("Ingrese el número del color:");
        balota1=sc.nextInt();
        System.out.print("Listo, ahora un número entre 1 y 5:");
        balota2=sc.nextInt();
        switch(balota1){
            case 1:
                System.out.println("Premio Amarillo");
                switch (balota2) {
                    case 1:
                        System.out.println("10% de descuento en la compra");
                        break;
                    case 2:
                        System.out.println("Gaseosa");
                        break;
                    case 3:
                        System.out.println("Desodorante");
                        break;
                    case 4:
                        System.out.println("Salchichas");
                        break;
                    case 5:
                        System.out.println("Camiseta");
                        break;
                    default:
                        System.out.println("Error en la selección!");
                }
                break;
            case 2:
                System.out.println("Premio Azul");
                if(balota2==1){
                    System.out.println("10% de descuento en la compra");   
                }
                else if(balota2==2){
                    System.out.println("Cerveza");
                }
                else if(balota2==3){
                    System.out.println("Crema Dental");
                }
                else if(balota2==4){
                    System.out.println("Jamón");
                }
                else if(balota2==5){
                    System.out.println("Pantaloneta");
                }
                else{
                    System.out.println("Error en la selección!");
                }
                break;
            case 3:
                System.out.println("Premio Rojo");
                break;
            default:
                System.out.println("Error en la selección!");
                
        }
        
        
    }
    
}
