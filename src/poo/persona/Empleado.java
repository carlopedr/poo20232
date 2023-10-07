
package poo.persona;

public class Empleado extends Persona{
    private String codigo;

    public Empleado(String codigo, String nombre, int edad, String dni) {
        super(nombre, edad, dni);
        this.codigo = codigo;
    }

    public Empleado() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void imprimir(){
        System.out.println("Imprime Empleado");
    }
    
    
}
