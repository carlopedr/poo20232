
package poo;

public class MiClaseCoche {
    //Atributos
    public String marca;
    public String color;
    public String matricula;
    public int cilindrada;
    
    //Constructores
    
    public MiClaseCoche(String ma, String co, String mt, int ci){
        marca=ma;
        color=co;
        matricula=mt;
        cilindrada=ci;
    }
    
    public MiClaseCoche(){
        
    }
    
    //Métodos
    
    public void dimeSiEsMetalizado() {
        if (color.equals("Negro")) {
            System.out.println("El coche tiene pintura metalizada");
        } else {
            System.out.println("El coche NO tiene pintura metalizada");
        }
    }
    
    public void matricularCoche(String matriculaAPoner) {
        matricula = matriculaAPoner;
    }
    
    public boolean verificarMarca(String marcaAVerificar){
        boolean res=false;
        if(marca.equals(marcaAVerificar))
            res=true;
        else
            res=false;
        return res;
    }
    
}
