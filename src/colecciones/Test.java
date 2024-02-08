
package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Moto m1 = new Moto(true,"Ducatti",20000,1200);
        Moto m2 = new Moto(false,"Honda",1000,125);
        Moto m3 = new Moto(true,"Yamaha",10000,600);
        Auto c1 = new Auto(true,false,"Renault",12000,800);
        Auto c2 = new Auto(true,true,"M  B  ",30000,1200);
        //System.out.println("Moto"+m.toString());
        //Matriculas
        m1.setMatricula("AB123C");
        m2.setMatricula("DE456F");
        m3.setMatricula("FG897H");
        c1.setMatricula("QWE789");
        c2.setMatricula("BVC560");
        Garage g =new Garage();
        List<Vehiculo> garage = new ArrayList<>();
        garage.add(m1);
        garage.add(m2);
        garage.add(m3);
        garage.add(c1);
        garage.add(c2);       
        for(Vehiculo v2:garage){
            if(v2!=null)
                System.out.println(v2.toString());
        }
        g.setGarageVehiculos(garage);
        System.out.println("Ing:" + g.calcularIngresos());
        System.out.println("CM: " + g.calcularOcupacionPorTipoVehiculo(m1));
        System.out.println("CA: " + g.calcularOcupacionPorTipoVehiculo(c1));
        //Matriculas
        System.out.println("BM: "+g.buscaVehiculo("XXFG897H"));
        g.eliminaVehiculo2(m3);
        g.listarVehiculos();
        
    }
}
