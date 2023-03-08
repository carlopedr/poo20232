package language;

import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] notas=new double[25];
        //Agregando datos al arreglo por medio del teclado
        for(int i=0;i<notas.length;i++){
            boolean valida=false;
            while (!valida) {
                System.out.print("Nota estudiante No. " + (i + 1) + ": ");
                //notas[i] = input.nextDouble();
                notas[i]=(double)((int)((Math.random()*5)*10))/10;
                if (notas[i] >= 0 && notas[i] <= 5) {
                    valida = true;
                } else {
                    System.out.println("Error en nota. Intente nuevamente!!");
                    valida = false;
                }
            }
        }
        //Ver el contenido del arreglo
        System.out.println("No. Est     Nota");
        for(int k=0;k<notas.length;k++){
            System.out.println((k+1)+"         "+notas[k]);
        }
        //Copiar un arreglo
        double [] notas1=new double[25];
        for(int i=0;i<notas.length;i++){
            notas1[i]=notas[i];
        }
        //Ordenar arreglo
        Arrays.sort(notas1);
        System.out.println("Nota");
        for(double nota : notas1){
            System.out.println(nota);
        }
        //Hallar máximo y mínimo
        double max=0,min=0;
        int posmax=0,posmin=0;
        for(int i=0;i<notas.length;i++){
            if(i==0){
                max=notas[0];
                min=notas[0];
                posmax=0;
                posmin=0;
            }
            else{
                if(notas[i]>max){
                    max=notas[i];
                    posmax=i;
                }
                if(notas[i]<min){
                    min=notas[i];
                    posmin=i;
                }
            }
        }
        System.out.println("Máximo: "+max+" Posición Máximo: "+posmax);
        System.out.println("Mínimo: "+min+" Posición Mínimo: "+posmin);
        
        //Calcular promedio
        double acum=0;
        for(double n : notas){
            acum+=n;
        }
        System.out.println("Acumulado: "+acum);
        double prom=acum/notas.length;
        System.out.println("Promedio: "+ prom);
        
        //Determinar l catidad de datos que son mayores y menores
        //que el promedio
        int nsup=0,nmen=0;
        
        
        
    }
    
}
