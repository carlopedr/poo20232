
package multivivienda;

public class Atico extends Piso{
    private int superficieTerraza;

       public Atico(int superficieTerraza, int planta, int puerta, String calle, int superficieEnMetros) {
        super(planta, puerta, calle, superficieEnMetros);
        this.superficieTerraza = superficieTerraza;
    }

    public int getSuperficieTerraza() {
        return superficieTerraza;
    }

    public void setSuperficieTerraza(int superficieTerraza) {
        this.superficieTerraza = superficieTerraza;
    }

    @Override
    public String toString() {
        return super.toString()+ " Atico{" + "superficieTerraza=" + superficieTerraza + '}';
    }
       
    
    
    
    
}
