
package gestiongaraje;

public class TestGaraje {
    public static void main(String[] args) {
        Garaje g = new Garaje();
        Vehiculo[] vs = new Vehiculo[5];
        vs[0]=new Moto(true, "XZR2345","H2R",55000,1100);
        vs[1]=new Auto(false,true,"FGT7890","AUDI",20000,3000);
        vs[2]= new Auto(false,true,"FABC890","BMW",15000,2000);
        vs[4]=new Moto(true, "1XR2345","HONDA",5000,1200);
        g.setGaraje(vs);
        for (Vehiculo v : vs) {
            if(v!=null)
                System.out.println("Clase: "+v.getClass() + " - CuotaMes: " + v.getCuotaMesGaraje());
        }
        
        System.out.println("Ingresos: "+ g.calcularIngresos());
        System.out.println(vs[4].getClass());
        //System.out.println("Ocupación Motos: "+g.calcularOcupacionPorTipoVehiculo(new Moto(true, "XZR2345","H2R",55000,1100)));
        //System.out.println("Ocupación Autos: "+g.calcularOcupacionPorTipoVehiculo(new Auto(false,true,"FABC890","BMW",15000,2000)));
        //System.out.println("Consulta Matricula: "+g.consultarMatriculaGaraje("1OR2345"));
    }
    
}
