
package ejerciciosPOO.fastFood;


public class Sandwich extends Receta{

    public Sandwich(String nombre, String[] ingredientes, String[] pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        int nvocals=0;
        String texto = super.getNombre();
        // Itera sobre cada caracter del texto y verifica si es una vocal
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            // Si el caracter es una vocal, incrementa el contador
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                nvocals++;
            }
        }
        return (2+nvocals);
    }

    @Override
    public boolean isVegetariano() {
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "plancha";
    }
    
}
