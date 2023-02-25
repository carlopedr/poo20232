
package language;

import java.util.Scanner;

public class InputScanner {
    public static void main(String args[])
        {
            //Definir un objeto
              Scanner sc=new Scanner(System.in);
              //Para textos: nextLine();
              System.out.print("Nombre: ");
              String name=sc.nextLine();
              System.out.println(name);
              System.out.println("Name: "+name);
              //Para enteros:
              System.out.print("Vint: ");
              int vint = sc.nextInt();
              System.out.println("Value int:" + vint);
              //Para reales: 
              System.out.print("VFloat: ");
              float vfloat=sc.nextFloat();
              System.out.print("VDouble: ");
              double vdouble = sc.nextDouble();
              /* Otro métodos de entrada:
                next()
                nextBigDecimal()
                nextBigInteger()
                nextBoolean()
                nextByte()
                nextDouble()
                nextFloat()
                nextInt()
                nextLine()
                nextLong()
                nextShort()
              */
        }
}
