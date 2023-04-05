package practicePooAM;

public class Test {
    public static void main(String[] args) {
        Vehiculo v1=new Vehiculo("abc123","Ferrari",100000,3000);
        System.out.println(v1.toString());
        
        Moto m1=new Moto(true,"xyz6789","Honda",2000,150);
        System.out.println(m1.toString());
    }
    
}
