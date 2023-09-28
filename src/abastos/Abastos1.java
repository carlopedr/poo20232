package abastos;

import java.util.Scanner;

public class Abastos1 {

    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        double[][] autos = new double[100][5];
        double tipoServicio, tipoProducto, peso, tiempo, largo, costo;
        boolean sigue = true;
        int nauto = 0;
        while (sigue) {
            System.out.println("Vehiculo No." + nauto + 1);
            System.out.println("Tipos de Servicio (1. Cargue - 2. Descargue");
            tipoServicio = sc.nextDouble();
            switch ((int) tipoServicio) {
                case 1:
                    System.out.println("Tipos de Producto (1. Perecedero - 2. No Perecedero");
                    tipoProducto = sc.nextDouble();
                    System.out.println("Peso transportado:");
                    peso=sc.nextDouble();
                    if(tipoProducto==1){
                        if(peso<=8){
                            costo=peso*1500;
                        }
                        else{
                            costo=peso*9000;
                        }
                    }
                    
                    break;
                case 2:
                    break;
                
                default:
                    System.out.println("Error tipo de servicio");
            }
        }

    }

}
