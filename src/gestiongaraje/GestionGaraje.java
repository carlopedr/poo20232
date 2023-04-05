
package gestiongaraje;


public class GestionGaraje {

    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v=new Vehiculo("BMW",45000,3000);
        System.out.println(v.toString());
        v.setCuotaMesGaraje(222);
        System.out.println(v.toString());
        v.setCuotaMesGaraje(-222);
        System.out.println(v.toString());
        v.matricular("gfd356");
        System.out.println(v.toString());
    }
    
}
