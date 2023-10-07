
package poo.bicicleta;

public class Test {
    public static void main(String[] args) {
        Bicicleta miBici=new Bicicleta(5,30,15);
        
        System.out.println(miBici.toString());
        Bicicleta tuBici=new Bicicleta(7,27,18);
        System.out.println(tuBici.toString());
        System.out.println("Acelerando mi bici");
        miBici.acelerar();
        System.out.println(miBici.toString());
        System.out.println("Frenar tu bici");
        tuBici.frenar();
        System.out.println(tuBici.toString());
        System.out.println("Cambiar plato a miBici sin args...");
        miBici.cambiarPlato();
        System.out.println(miBici.toString());
        Bicicleta defaultBici =new Bicicleta();
        System.out.println("Default A: "+defaultBici.toString());
        defaultBici.setVelocidadActual(50);
        System.out.println("Default D: "+defaultBici.toString());
        BicicletaMontana bMt=new BicicletaMontana(10,23,32,18);
        System.out.println("BM: "+bMt.toString());
        bMt.acelerar();
        System.out.println("BM Ac: "+bMt.toString());
        bMt.imprime();
    }
    
}
