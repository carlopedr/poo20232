
package multivivienda;

public class Adosado extends Vivienda {
    private int numPlantas;

    public Adosado(int numPlantas, String calle, int superficieEnMetros) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }
    
    
}
