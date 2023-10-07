
package poo.persona;

public class Profesor extends Empleado{
    private String profesion;

    public Profesor() {
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Imprime Profesor");
    }
}
