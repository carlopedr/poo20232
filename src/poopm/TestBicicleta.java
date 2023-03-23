
package poopm;


public class TestBicicleta {
    public static void main(String[] args) {
        Bicicleta miBici = new Bicicleta(25,52,18);
        System.out.println("MiBici: "+miBici.toString());
        Bicicleta tuBici = new Bicicleta(30,54,16);
        System.out.println("TuBici: "+tuBici.toString());
        //Acelerar
        miBici.acelerar();
        
        System.out.println("MiBici después de acelerar: "+miBici.toString());
        tuBici.frenar();
        System.out.println("TuBici después de frenar: "+tuBici.toString());
        //miBici.platoActual=48;
        miBici.setPlatoActual(48);
        System.out.println("MiBici después de cambiar plato: "+miBici.toString());
        System.out.println("Piñon de mibici: "+miBici.getPinonActual());
        tuBici.setVelocidadActual(-17);
        System.out.println("TuBici después de cambiar velocidad: "+tuBici.toString());
        Bicicleta [] peloton = new Bicicleta[10];
        for(int i=0;i<peloton.length;i++){
            int vel=(int)(Math.random()*30)+20;
            int plato=(int)(Math.random()*35)+20;
            int pinon=(int)(Math.random()*10)+20;
            peloton[i]=new Bicicleta(vel,plato,pinon);
        }
        for(Bicicleta bici:peloton){
            System.out.println(bici.toString());
        }
        //System.out.println(i+j);
    }
    
}
