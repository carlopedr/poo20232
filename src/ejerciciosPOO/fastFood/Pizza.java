
package ejerciciosPOO.fastFood;


public class Pizza extends Receta {
    

    public Pizza(String nombre, String[] ingredientes, String[] pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        return (2+super.getNombre().length());
    }

    @Override
    public boolean isVegetariano() {
        boolean res=true;
        for(String ing : super.getIngredientes() ){
            ing=ing.toUpperCase();
            res= !ing.contains("CARNE");
        }
        return res;
    }

    @Override
    public String tipoPreparacion() {
        return "horno";
    }
    
}
