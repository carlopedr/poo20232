package multivivienda;

public class Chalet extends Vivienda{
    private int numParcela;
    private boolean conPiscina;

    public Chalet(int numParcela, boolean conPiscina, String calle, int superficieEnMetros) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }

    public void setConPiscina(boolean conPiscina) {
        this.conPiscina = conPiscina;
    }
    
    @Override
    public void calcularPrecio(){
        double precio=super.getSuperficieEnMetros()*1300;
        super.setPrecio(precio);
        //this.precio=this.superficieEnMetros*1300;
    }
}
