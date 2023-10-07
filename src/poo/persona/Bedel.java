package poo.persona;

public class Bedel extends Empleado{
    private int sueldo;

    public Bedel() {
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Imprime Bedel");
    }
}
