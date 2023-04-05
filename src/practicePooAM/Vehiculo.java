
package practicePooAM;

public class Vehiculo {
    private String matricula=null;
    private String marca; 
    private double precio;
    private int cilindrada;
    private double impuestoCirculacion;
    private double cuotaMesGarage=CUOTAMES;
    public static final double CUOTAMES=50;

    public Vehiculo(String matricula, String marca, double precio, int cilindrada) {
        if (this.matricular(matricula)) {
            this.marca = marca;
            this.precio = precio;
            this.cilindrada = cilindrada;
            this.calcularImpuestoCirculacion();
        }
        
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public double getCuotaMesGarage() {
        return cuotaMesGarage;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }

    public void setCuotaMesGarage(double cuotaMesGarage) {
        this.cuotaMesGarage = cuotaMesGarage;
    }

      
    
    
    public void calcularImpuestoCirculacion(){
        //Es el 2% importe del coche
        this.impuestoCirculacion=this.precio*0.02;
    }
    
    public boolean matricular(String matricula){
        boolean rta=false;
        //Da valor al campo matricula, siempre que el 
        //parámetro matricula tenga 7 caracteres. 
        //Devuelve si ha podido dar valor a la matrícula.
        if(matricula.length()==7)
        {
            rta=true;
            this.matricula=matricula.toUpperCase();
        }
        return rta;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", precio=" + precio + ", cilindrada=" + cilindrada + ", impuestoCirculacion=" + impuestoCirculacion + ", cuotaMesGarage=" + cuotaMesGarage + '}';
    }
    
    


    

}
