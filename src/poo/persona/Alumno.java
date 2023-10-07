
package poo.persona;

public class Alumno extends Persona{
    private String email;

    public Alumno() {
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Imprime Alumno");
    }
}
