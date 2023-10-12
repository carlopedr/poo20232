
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

    @Override
    public String toString() {
        return super.toString()+" Adosado{" + "numPlantas=" + numPlantas + '}';
    }
    
    @Override
    public double impuestoMunicipal() {
        return super.getPrecio()*0.05;
    }
    
}
