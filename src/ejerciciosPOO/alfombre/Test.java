
package ejerciciosPOO.alfombre;


public class Test {
    public static void main(String[] args) {
        AlfombraRedonda ar = new AlfombraRedonda(5,"AZUL", 100);
        System.out.println("Sup:"+ar.calcularSuperficie());
        System.out.println("PV :"+ar.calcularPrecio());
        System.out.println("Aum:"+ar.actualizarPrecio());
        System.out.println("Reb:"+ar.ponerEnRebajas());
    }
}
