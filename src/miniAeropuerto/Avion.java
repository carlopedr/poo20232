package miniAeropuerto;

public class Avion {
    private String modelo;
    private String matricula;
    private Persona piloto;

    public Avion(String modelo, String matricula, Persona piloto) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.piloto = piloto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getPiloto() {
        return piloto;
    }

    public void setPiloto(Persona piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Avion{" + "modelo=" + modelo + ", matricula=" + matricula + ", piloto=" + piloto + '}';
    }

    

}
