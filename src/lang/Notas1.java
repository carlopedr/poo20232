package lang;

import java.util.Scanner;

public class Notas1 {
    public static void main(String[] args) {
        double notas[];
        int nest,aprob=0,reprob=0;
        double mayor,menor,media,acum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de estudiantes: ");
        nest=sc.nextInt();
        //Validar que nest sea positivo y menor o igual que 30
        notas=new double[nest];
        //Llenar el arreglo
        for(int i=0;i<notas.length;i++){
            System.out.print("Nota Estudiante No. "+(i+1)+":");
            //notas[i]=sc.nextDouble();
            notas[i]=Math.random()*5;
            System.out.println(notas[i]);
        }
        //Procesamiento del arreglo
        mayor=notas[0];
        menor=notas[0];
        for(int i=0;i<notas.length;i++){
            if(notas[i]>mayor)
                mayor=notas[i];
            if(notas[i]<menor)
                menor=notas[i];
            acum+=notas[i];
            if(notas[i]<3.0)
                reprob++;
            else
                aprob++;
        }
        System.out.println("Nota Mayor: "+mayor);
        System.out.println("Nota Menor: "+menor);
        media=acum/nest;
        System.out.println("Nota Media: "+media);
        System.out.println("Aprobados : "+aprob);
        System.out.println("Reprobados: "+reprob);
    }
}
