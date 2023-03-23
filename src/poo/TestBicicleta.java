package poo;

public class TestBicicleta {
    public static void main(String[] args) {
        Bicicleta miBici = new Bicicleta(26,52,24);
        Bicicleta tuBici = new Bicicleta(30,54,22);
        
        System.out.println("Mi bici: Velocidad Actual 1: "+miBici.getVelocidadActual());
        miBici.setVelocidadActual(-32);
        System.out.println("Mi bici: Velocidad Actual 2: "+miBici.getVelocidadActual());
    }
}
