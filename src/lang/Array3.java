package lang;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int nalumnos=0;
        double notas[];
        double alta,baja,media=0,aprobado=0,suspenso=0,acum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de alumnos: ");
        nalumnos=sc.nextInt();
        if(nalumnos<=30){
            notas=new double[nalumnos];
            //Capturando los datos por teclado
            for(int i=0;i<notas.length;i++){
                System.out.print("Nota alumno No. "+(i+1)+": ");
                notas[i]=sc.nextDouble();
            }
            alta=notas[0];
            baja=notas[0];
            for(int i=0;i<notas.length;i++){
                if(notas[i]>alta)
                    alta=notas[i];
                if(notas[i]<baja)
                    baja=notas[i];
                acum+=notas[i];
                if(notas[i]>=3)
                    aprobado++;
                else
                    suspenso++;
            }
            media=acum/nalumnos;
            System.out.println("Alta: "+alta);
            System.out.println("Baja: "+baja);
            System.out.println("Media: "+media);
            System.out.println("Aprobados: "+aprobado);
            System.out.println("Suspenso: "+suspenso);
        }else
            System.out.println("Cantidad de alumnos excedida. Máximo 30. Intente nuevamente.");
    }
}
