
package gestiongaraje;

public class Vehiculo {
    //Atributos
    private String matricula=null; 
    private String marca;
    private double precio; 
    private int cilindrada;
    private double impuestoCirculacion;
    private double cuotaMesGaraje;
    public static final double CUOTA=100;
    
    //Constructores

    public Vehiculo(String marca, double precio, int cilindrada) {
        this.marca = marca;
        this.precio = precio;
        this.cilindrada = cilindrada;
        this.cuotaMesGaraje=CUOTA;
        this.calcularImpuestoCirculacion();
    }
    //Getters y Setters
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

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if(cuotaMesGaraje<0){
            this.cuotaMesGaraje=CUOTA;
        }
        else
            this.cuotaMesGaraje = cuotaMesGaraje;
    }
    
    //Métodos de la clase
    
    public void calcularImpuestoCirculacion(){
        //2% del precio
        this.impuestoCirculacion=this.precio*0.02;
    }
        
    public boolean matricular(String matricula){
        boolean res=false;
        if(matricula.length()==7){
            this.matricula=matricula.toUpperCase();
            res=true;
        }
        return res;
    }
    
    
    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", precio=" + precio + ", cilindrada=" + cilindrada + ", impuestoCirculacion=" + impuestoCirculacion + ", cuotaMesGaraje=" + cuotaMesGaraje + '}';
    }
    
    
    
    

}
