
package poo.bicicleta2;

public class Test {
    public static void main(String[] args) {
        Bicicleta miBici = new Bicicleta(10,30,18);
        System.out.println("Mi bici: "+miBici.toString());
        Bicicleta tuBici = new Bicicleta(31,34,14);
        System.out.println("Tu bici: "+tuBici.toString());
        //Acelerar mi bici
        miBici.acelerar();
        System.out.println("Mi bici despues de acelerar: "+miBici.toString());
        //Frenar tu bici
        tuBici.frenar();
        System.out.println("Tu bici despues de frenar: "+tuBici.toString());
//        miBici.velocidadActual=200;
        Bicicleta bici1=new Bicicleta();
        System.out.println("Bici1: "+bici1.toString());
        System.out.println("PI:"+Math.PI);
        //bici1.NUMRUEDAS=4;
        System.out.println("Num ruedas bici1:"+Bicicleta.NUMRUEDAS);
        //Math.PI=10;
        //bici1.velocidadActual=30;
        bici1.setVelocidadActual(30);
        //int va=bici1.velocidadActual;
        System.out.println("Bici1: "+bici1.toString());
        int va=bici1.getVelocidadActual();
        System.out.println("VA: "+va);
    }
}
