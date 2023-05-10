package gestiongaraje;

import java.util.Scanner;

public class GestionGaraje {

    private static Garaje g=new Garaje();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //agregarDatos();
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Alquilar una plaza");            
            System.out.println("2. Baja de alquiler");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción coches / motos");
            System.out.println("5. Listado de matrículas y cuota mensual y tipo vehículo");
            System.out.println("0. Terminar");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    //alquilaPlaza();
                    break;
                case 2:
                    //bajaPlaza();
                    break;
                case 3:
                    System.out.println("Recaudo Mensual= $" + g.calcularIngresos());
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Fin de proceso");
                    break;
                default:
                    System.out.println("Opción incorrecta. Intente de nuevo");
                
            }
            
        }
        
    }
    
    public static void agregarDatos() {
        g.agregarVehiculo(new Moto(true, "XZR2345", "H2R", 55000, 1100));
        g.agregarVehiculo(new Auto(false, true, "FGT7890", "AUDI", 20000, 3000));
        g.agregarVehiculo(new Auto(false, true, "FABC890", "BMW", 15000, 2000));
        g.agregarVehiculo(new Moto(true, "1XR2345", "HONDA", 5000, 1200));
        /*Vehiculo[] vs = new Vehiculo[Garaje.CAPACIDAD];
        vs[0]=new Moto(true, "XZR2345","H2R",55000,1100);
        vs[1]=new Auto(false,true,"FGT7890","AUDI",20000,3000);
        vs[2]= new Auto(false,true,"FABC890","BMW",15000,2000);
        vs[4]=new Moto(true, "1XR2345","HONDA",5000,1200);
        return vs;*/
    }
    
    public static void alquilarPlaza() {
        Vehiculo v = capturaVehiculo();
        g.agregarVehiculo(v);
        
    }
    
    public static void bajaAlquiler() {
        
    }
    
    public static Vehiculo capturaVehiculo() {
        Vehiculo v=null;
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Tipo de Vehículo");
            System.out.println("1. Auto");
            System.out.println("2. Moto");
            System.out.println("0. Terminar");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Datos del Auto");
                    Auto a = new Auto();
                    System.out.print("Matricula     : ");
                    a.setMatricula(sc.nextLine());
                    System.out.print("Marca         : ");
                    a.setMarca(sc.nextLine());
                    System.out.print("Precio        : ");
                    a.setPrecio(sc.nextDouble());
                    System.out.print("Cilidrada     : ");
                    a.setCilindrada(sc.nextInt());
                    System.out.print("Radio(S/N)    : ");
                    if (sc.nextLine().toUpperCase().equals("S")) {
                        a.setTieneRadio(true);
                    } else {
                        a.setTieneRadio(false);
                    }
                    System.out.print("Navegador(S/N): ");
                    if (sc.nextLine().toUpperCase().equals("S")) {
                        a.setTieneNavegador(true);
                    } else {
                        a.setTieneNavegador(false);
                    }
                    v = a;
                    break;
                case 2:
                    System.out.println("Datos de la Moto");
                    Moto m = new Moto();
                    System.out.print("Matricula     : ");
                    m.setMatricula(sc.nextLine());
                    System.out.print("Marca         : ");
                    m.setMarca(sc.nextLine());
                    System.out.print("Precio        : ");
                    m.setPrecio(sc.nextDouble());
                    System.out.print("Cilidrada     : ");
                    m.setCilindrada(sc.nextInt());
                    System.out.print("Sidecar(S/N)    : ");
                    if (sc.nextLine().toUpperCase().equals("S")) {
                        m.setTieneSidecar(true);
                    } else {
                        m.setTieneSidecar(false);
                    }
                    v = m;
                    break;
                default:
                    System.out.println("Error en la opción!");
            }
        }
        return v;
    }
    
}
