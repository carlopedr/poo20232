package ejerciciosPOO.equipo;

public class JugadorAlevin extends JugadorJunior{
    private String nacionalidad;

    public JugadorAlevin(String nacionalidad, int antiguedad, String nombre, int dorsal, int edad) {
        super(antiguedad, nombre, dorsal, edad);
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return super.toString()+ "JugadorAlevin{" + "nacionalidad=" + nacionalidad + '}';
    }
    
    
}
