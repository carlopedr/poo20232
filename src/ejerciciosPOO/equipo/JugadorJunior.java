package ejerciciosPOO.equipo;

public class JugadorJunior extends Jugador{
    private int antiguedad;

    public JugadorJunior(int antiguedad, String nombre, int dorsal, int edad) {
        super(nombre, dorsal, edad);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return super.toString()+" JugadorJunior{" + "antiguedad=" + antiguedad + '}';
    }
    
    
}
