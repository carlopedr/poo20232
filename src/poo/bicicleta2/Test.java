
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
        miBici.velocidadActual=200;
        
    }
}
