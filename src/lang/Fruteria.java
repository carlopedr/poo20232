/*
Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS		% DESCUENTO
	  0   -   2		  0%
	 2.01 -   5 		  10%
	 5.01 -   10		  15%
	10.01 en adelante	  20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.
*/
package lang;
import java.util.Scanner;
public class Fruteria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vrPago,vrDto,vrBruto,precio;
        float kilos;
        System.out.print("Kilos: ");
        kilos=sc.nextFloat();
        System.out.print("Precio Kilo: ");
        precio=sc.nextInt();
        vrBruto=(int)(precio*kilos);
        if(kilos<=2){
            vrDto=0;
        }else if(kilos<=5){
            vrDto=(int)(vrBruto*0.1);
        }else if(kilos<=10){
            vrDto=(int)(vrBruto*0.15);
        }else{
            vrDto=(int)(vrBruto*0.2);
        }
        if(kilos<=2){
            vrDto=0;
        }else if(kilos<=5){
            vrDto=(int)(vrBruto*0.1);
        }else if(kilos<=10){
            vrDto=(int)(vrBruto*0.15);
        }else{
            vrDto=(int)(vrBruto*0.2);
        }
        vrPago=vrBruto-vrDto;
        System.out.println("Precio:     "+precio);
        System.out.println("Kilos:   "+kilos);
        System.out.println("Vr.Bruto:  "+vrBruto);
        System.out.println("vr.Dto:     "+vrDto);
        System.out.println("Vr.Pago:  "+vrPago);
    }
}
