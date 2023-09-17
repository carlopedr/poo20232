
package lang;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int arreglo []=new int[10];
        int acum=0;
        //Scanner sc = new Scanner(System.in);
        //LLenando el arreglo
        for(int i=0;i<arreglo.length;i++){ 
            System.out.print("Pos "+i+":");
            //arreglo[i]=sc.nextInt();
            arreglo[i]=(int)(Math.random()*20);
            System.out.println(arreglo[i]);
        }
        //Mostrando el contenido del arreglo
        System.out.println("Contenido del arreglo");
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
            acum+=arreglo[i];
            
        }
        System.out.println("Acum: "+acum);
        
    }
}
