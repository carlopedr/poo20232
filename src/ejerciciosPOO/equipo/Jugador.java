package ejerciciosPOO.equipo;

class Jugador {
    private String nombre;
    private int dorsal;
    private int edad;

    public Jugador(String nombre, int dorsal, int edad) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", dorsal=" + dorsal + ", edad=" + edad + '}';
    }
    
    
}
