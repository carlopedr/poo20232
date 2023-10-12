package ejerciciosPOO.equipo;

public class JugadorSenior extends Jugador{
    private double salario;

    public JugadorSenior(double salario, String nombre, int dorsal, int edad) {
        super(nombre, dorsal, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+" JugadorSenior{" + "salario=" + salario + '}';
    }
    
    
}
