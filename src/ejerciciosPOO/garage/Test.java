
package ejerciciosPOO.garage;

public class Test {
    public static void main(String[] args) {
        Moto m1 = new Moto(true,"Ducatti",20000,1200);
        Moto m2 = new Moto(false,"Honda",1000,125);
        Moto m3 = new Moto(true,"Yamaha",10000,600);
        Auto c1 = new Auto(true,false,"Renault",12000,800);
        Auto c2 = new Auto(true,true,"MB",30000,1200);
        //System.out.println("Moto"+m.toString());
        Garage g =new Garage();
        Vehiculo [] va=new Vehiculo[100];
        va[0]=m1;
        va[1]=m2;
        va[2]=m3;
        va[3]=c1;
        
        va[5]=c2;
        for(Vehiculo v2:va){
            if(v2!=null)
                System.out.println(v2.toString());
        }
        g.setGarageVehiculos(va);
        System.out.println("Ing:" + g.calcularIngresos());
        System.out.println("CM: " + g.calcularOcupacionPorTipoVehiculo(m1));
        System.out.println("CA: " + g.calcularOcupacionPorTipoVehiculo(c1));
        
        
    }
}
