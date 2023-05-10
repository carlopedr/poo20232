
package gestiongaraje;


public class Test {
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v=new Vehiculo("ABC1234", "BMW",45000,3000);
        System.out.println(v.toString());
        v.setCuotaMesGaraje(222);
        System.out.println(v.toString());
        v.setCuotaMesGaraje(-222);
        System.out.println(v.toString());
        v.matricular("gfd356");
        System.out.println(v.toString());
    }
}
