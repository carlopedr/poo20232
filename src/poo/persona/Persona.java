
package poo.persona;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //Métodos
    //void esMayorDeEdad() escribe por pantalla si la persona es mayor de edad o si no lo es.
    
    public void esMayorDeEdad(){
        if(this.edad>=18)
            System.out.println("Mayor de Edad");
        else
            System.out.println("No es Mayor de Edad");
    }
    
    /*int cuantoHaceMayorEdad() es un método que no recibe parámetro y devuelve el número de
años que hace que la persona es mayor de edad (si la persona es menor de edad deberá por lo
tanto devolver un valor negativo)*/
    
    public int cuantoHaceMayorEdad(){
        return edad-18;
    }
    
    /*boolean asignarDNI() es un método que recibe un String por 
    parámetro, y lo asigna al DNI de la Persona. Sin embargo, 
    no debe asignar el DNI si éste no es correcto (es correcto 
    si tiene 9 caracteres, ni más ni menos). El método además 
    devuelve un valor booleano dependiendo de si el DNI se ha 
    validado (y por lo tanto, se ha asignado al atributo de 
    la clase )
    */
    public boolean asignarDNI(String dni){
        if(dni.length()==9){
            this.dni=dni;
            return true;
        }
        else
            return false;
    }
    //boolean estaJubilado() devuelve true o false dependiente de si la persona esta jubilada o no
//Se considera que una persona se jubila a los 65.
    
    public boolean estaJubilado(){
        if(this.edad>=65)
            return true;
        else
            return false;
    }
    
    public void imprimir(){
        System.out.println("Imprime Persona");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }
    
    
}
