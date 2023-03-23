
package poo;

public class Alcance {
    private int atributo1;
    static int estatico1;
    
    public static void main(String[] args) {
        int varLocal=10;
        if(varLocal==10){
            int varBloque=23;
            System.out.println(varBloque);
        }
        //Error variable fuera del bloque
        //varBloque=34;
        varLocal=14;
        //Error porque main es un método static
        //atributo1=45;
        estatico1=67;
    }

    public int getAtributo1() {
        //Error porque es una variable local para el métodod main
        //varLocal=13;
        atributo1=54;
        estatico1=78;
        return atributo1;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    public static int getEstatico1() {
        return estatico1;
    }

    public static void setEstatico1(int estatico1) {
        Alcance.estatico1 = estatico1;
    }
    
    
    
}
