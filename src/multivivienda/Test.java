
package multivivienda;

public class Test {
    public static void main(String[] args) {
        //Vivienda v = new Vivienda("Main St",120);
        //System.out.println(v.toString());
        Piso p = new Piso(2,201,"Av. Principal",90);
        p.calcularPrecio();
        System.out.println(p);
        p.aumentarPrecio(155);
        System.out.println("AP: "+p);
        System.out.println("IM: "+p.impuestoMunicipal());
        Adosado a = new Adosado(6,"5th Av",60);
        a.calcularPrecio();
        System.out.println(a.toString());
        System.out.println("IM: "+a.impuestoMunicipal());
        Chalet c = new Chalet(17,true,"Parcelación Neiva",1500);
        Chalet c1 = new Chalet(23,false,"Parcelación Rivera",1000);
        c.calcularPrecio();
        System.out.println(c.toString());
        c1.calcularPrecio();
        System.out.println(c1.toString());
        System.out.println("IM: "+c.impuestoMunicipal());
        Atico at=new Atico(60,5,502,"Venice Beach",200);
        at.calcularPrecio();
        System.out.println(at.toString());
        System.out.println("IM: "+at.impuestoMunicipal());
        Vivienda [] predios={c1,p,a,c};
        Urbanizacion u = new Urbanizacion(predios);
        System.out.println("SP:"+u.sumaPrecios());
        
        System.out.println("SPCh: "+ u.sumaChalet());
        
    }
    
}
