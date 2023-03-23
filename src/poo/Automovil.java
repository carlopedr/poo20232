package poo;

public class Automovil {
    //Atributos
    String marca;
    String color;
    String matricula;
    int cilindrada;

    public Automovil(String marca, String color, String matricula, int cilindrada) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }

    public Automovil(String marca, String color, int cilindrada) {
        this.marca = marca;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil() {
    }
    
 
    
    
    public void dimeSiEsMetalizado(){
        if(color.equals("Negro")){
            System.out.println("Es metalizado");
        }
        else {
            System.out.println("No es metalizado");
        }
    }
    
    public void cambiarMatricula(String matriculaNueva){
        matricula=matriculaNueva;
    }
    
    public boolean verificarMarca(String marcaAVerificar){
        boolean respuesta=false;
        if(marca.equals(marcaAVerificar)){
            respuesta=true;
        }
        else
            respuesta=false;
        return respuesta;
    }
    
    /*public Automovil(String marca,String color, String matricula, int cilindrada){
        this.marca=marca;
        this.color=color;
        this.matricula=matricula;
        this.cilindrada=cilindrada;
    }*/
    
}
