
package ejerciciosPOO.fastFood;

public class Restaurante {
    private IFastFood[] arrayRecetasRestaurante = new IFastFood[10];
    private Menu menuDiario;
    
    public void creaReceta(){
        String [] ingP1={"Harina","Sal","Piña","Jamon","Salsa"};
        String [] ingP2={"Harina","Sal","Carne","Tomate","Salsa"};
        String [] pasos={"paso 1", "paso 2","paso3"};
        Pizza p1 = new Pizza("Hawaianna",ingP1,pasos);
        arrayRecetasRestaurante[0]=p1;
        Pizza p2 = new Pizza("Carne",ingP2,pasos);
        arrayRecetasRestaurante[1]=p2;
        String [] ingS1={"Pan","Queso","Tomate","Jamon","Salsa"};
        String [] ingS2={"Pan 2","Queso 2","Cebolla","Tomate","Salsa"};
        arrayRecetasRestaurante[2]=new Sandwich("Cubano",ingS1,pasos);
        arrayRecetasRestaurante[3]=new Sandwich("Americano",ingS1,pasos);
    }
}
