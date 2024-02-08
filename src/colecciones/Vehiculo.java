package colecciones;

public class Vehiculo {

    private String matricula = null;
    private String marca;
    private double precio;
    private int cilindrada;
    private double impuestoCirculacion=0;
    private double cuotaMesGarage;
    public static double CUOTAMESGARAGE = 100;

    public Vehiculo(String marca, double precio, int cilindrada) {
        this.marca = marca;
        this.precio = precio;
        this.cilindrada = cilindrada;
        //setCuotaMesGarage(CUOTAMESGARAGE);
        this.cuotaMesGarage = CUOTAMESGARAGE;
        calcularImpuestoCirculacion();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }

    public double getCuotaMesGarage() {
        return cuotaMesGarage;
    }

    public void setCuotaMesGarage(double cuotaMesGarage) {
        if (cuotaMesGarage < 0) {
            this.cuotaMesGarage = CUOTAMESGARAGE;
        } else {
            this.cuotaMesGarage = cuotaMesGarage;
        }
    }
    
    public void calcularImpuestoCirculacion(){
        this.impuestoCirculacion=this.precio*0.02;
    }
    
    public boolean matricular(String matricula){
        if(matricula.length()==7){
            this.matricula=matricula.toUpperCase();
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", precio=" + precio + ", cilindrada=" + cilindrada + ", impuestoCirculacion=" + impuestoCirculacion + ", cuotaMesGarage=" + cuotaMesGarage + '}';
    }
    

}
