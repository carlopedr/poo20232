//Genera 10 números aleatorios, los acumula y saca el promedio
package lang;

public class EjemploFor2 {
    public static void main(String[] args) {
        int numero, i,acum=0;
        for(i=1;i<=10;i++){
            numero=(int)(Math.random()*100);
            System.out.println("Numero: "+numero);
            acum=acum+numero;
        }
        System.out.println("Acumulado: "+acum);
        int prom=acum/(i-1);
        System.out.println("Promedio: "+prom);
    }
}
