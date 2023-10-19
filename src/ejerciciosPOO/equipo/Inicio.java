package ejerciciosPOO.equipo;

import java.util.Scanner;
import javax.crypto.spec.GCMParameterSpec;

public class Inicio {

    private static Plantilla p;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p = new Plantilla();
        int op = 0;
        while (op != 5) {
            menu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    alta();
                    break;
                case 2:
                    lista();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    buscar();
                    break;
                case 5:
                    System.out.println("Salida!");
                    break;
                default:
                    System.out.println("Opción equivocada. Intente de nuevo!");
            }
        }
    }

    private static void menu() {
        System.out.println("Menú:");
        System.out.println("1. Alta");
        System.out.println("2. Lista");
        System.out.println("3. Eliminar");
        System.out.println("4. Buscar");
        System.out.println("5. Salir");
        System.out.print("Ingrese la opción deseada: ");
    }

    /*
Se piden por teclado los valores al usuario
Si es senior no puede tener menos de 18 años, ni de 16 si es alevín
No puede haber mas de 24 jugadores en la plantilla, lo que además implica que el dorsal no
puede ser negativo ni mayor de 24, y que no puede haber dorsales repetidos
No puede haber mas de 5 Juniors
No puede haber mas de 2 alevines, y siempre que alguno sea español
No se puede fichar a nadie si la masa salarial de todos los jugadores es más de10 veces lo que
cobra el jugador que más cobra
     */
    private static void alta() {
        Scanner sc = new Scanner(System.in);
        String tipo, nombre, nacion;
        int dorsal, edad, ant;
        double salario;
        System.out.println("Agregar un jugador:");
        System.out.print("Dorsal:");
        dorsal = sc.nextInt();
        //Validación de dorsal
        if (dorsal > 25 || dorsal < 1) {
            System.out.println("Dorsal fuera de rango");
            return;
        } else {
            Jugador jb = p.buscarJugador(dorsal);
            if (jb != null) {
                System.out.println("Dorsal ocupado");
                return;
            }
        }

        sc.nextLine();
        System.out.print("Nombre:");
        nombre = sc.nextLine();
        System.out.print("Edad:");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Tipo (N,A,J,S):");
        tipo = sc.nextLine();
        tipo = tipo.toUpperCase();
        System.out.println("Tipo: " + tipo.charAt(0));
        switch (tipo.charAt(0)) {
            case 'A':
                System.out.println("Datos Jugador Alevin");
                if (edad <= 16) {
                    System.out.println("Jugador alevin - No cumple requisito de edad");
                    return;
                } else {
                    int cantAlev = p.contarAlevines();
                    System.out.println("CA:" + cantAlev);
                    if (cantAlev == 0) {
                        System.out.print("Nacionalidad:");
                        nacion = sc.nextLine();
                        System.out.print("Antiguedad:");
                        ant = sc.nextInt();
                        JugadorAlevin jA = new JugadorAlevin(nacion, ant, nombre, dorsal, edad);
                        p.anadirJugador(jA);
                    } else {
                        if (cantAlev == 1) {
                            for (Jugador jg : p.getEquipo()) {
                                if (jg instanceof JugadorAlevin) {
                                    String nac = ((JugadorAlevin) jg).getNacionalidad();
                                    if (nac.toUpperCase().equals("ESPAÑOL")) {
                                        System.out.print("Nacionalidad:");
                                        nacion = sc.nextLine();
                                        if (nacion.toUpperCase().equals("ESPAÑOL")) {
                                            System.out.println("Ya hay un alevin español...");
                                            return;
                                        } else {
                                            System.out.print("Antiguedad:");
                                            ant = sc.nextInt();
                                            JugadorAlevin jA = new JugadorAlevin(nacion, ant, nombre, dorsal, edad);
                                            p.anadirJugador(jA);
                                        }
                                    } else {
                                        System.out.println("Debe agregar un alevin español");
                                        nacion = "ESPAÑOL";
                                        System.out.print("Antiguedad:");
                                        ant = sc.nextInt();
                                        JugadorAlevin jA = new JugadorAlevin(nacion, ant, nombre, dorsal, edad);
                                        p.anadirJugador(jA);
                                    }
                                }
                            }
                        } else {
                            System.out.println("Ya esta cubierto el cupo de alevines");
                            return;
                        }
                    }
                }
                break;

            case 'J':
                int cantJr = p.contarJunior();
                if (cantJr < 5) {
                    System.out.print("Antiguedad:");
                    ant = sc.nextInt();
                    JugadorJunior jR = new JugadorJunior(ant, nombre, dorsal, edad);
                    p.anadirJugador(jR);
                } else {
                    System.out.println("No pueden haber mas de 5 jugadores Junior");
                    return;
                }
                break;
            case 'S':
                if (edad < 18) {
                    System.out.println("Jugador Senior - No cumple requisito de edad");
                    return;
                } else {
                    System.out.print("Salario:");
                    salario = sc.nextDouble();
                    JugadorSenior jS = new JugadorSenior(salario, nombre, dorsal, edad);
                    p.anadirJugador(jS);
                }
                break;

            case 'N':
                Jugador j = new Jugador(nombre, dorsal, edad);
                p.anadirJugador(j);
                break;
            default:
                System.out.println("Tipo de jugador equivocado!");
        }
    }

    private static void lista() {
        Scanner sc = new Scanner(System.in);
        //datosPrueba();
        System.out.println("Tipo de Listado:");
        System.out.println("G - General");
        System.out.println("J - Junior");
        System.out.println("S - Senior");
        System.out.println("A - Alevines");
        System.out.print("Seleccione la opción: ");
        String op = sc.nextLine();
        op.toUpperCase();
        switch (op.charAt(0)) {
            case 'G':
                for (Jugador jf : p.getEquipo()) {
                    if (jf != null) {
                        System.out.println(jf.toString());
                    }
                }
                break;
            case 'J':
                System.out.println("Dorsal  Nombre      Edad       Ant");
                for (Jugador jf : p.getEquipo()) {
                    if (jf instanceof JugadorJunior) //JugadorJunior jJ=(JugadorJunior)jf;
                    {
                        System.out.print(jf.getDorsal() + "   ");
                        System.out.print(jf.getNombre() + "   ");
                        System.out.print(jf.getEdad() + "    ");
                        System.out.println(((JugadorJunior) jf).getAntiguedad());
                    }
                }
                break;

            case 'S':
                break;
            case 'A':
                break;
            default:
                System.out.println("Opcion equivocada!");
        }
        
    }

    private static void eliminar() {
        datosPrueba();
        Scanner sc = new Scanner(System.in);
        System.out.print("Dorsal a eliminar: ");
        int dorsalE=sc.nextInt();
        sc.nextLine();
        Jugador j = p.buscarJugador(dorsalE);
        if(j!=null){
            p.borrarJugador(dorsalE);
            System.out.println("Jugador eliminado");
        }else{
            System.out.println("No existe el jugador a borrar");
        }
    }

    private static void buscar() {
        datosPrueba();
        Scanner sc = new Scanner(System.in);
        System.out.print("Dorsal a buscar: ");
        int dorsalB=sc.nextInt();
        sc.nextLine();
        Jugador j = p.buscarJugador(dorsalB);
        if(j!=null){
            System.out.print("Jugador encontrado:");
            System.out.println(j.toString());
        }else{
            System.out.println("No existe el jugador buscado");
        }
    }
    
    private static void datosPrueba(){
        Jugador j = new Jugador("Leonel", 10, 34);
        JugadorAlevin jA = new JugadorAlevin("COL", 2, "Mateo", 23, 16);
        JugadorJunior jJ = new JugadorJunior(4, "Kevin", 19, 19);
        JugadorSenior jS = new JugadorSenior(100000, "Radamel", 9, 37);
        p.anadirJugador(j);
        p.anadirJugador(jA);
        p.anadirJugador(jJ);
        p.anadirJugador(jS);
        for (Jugador jf : p.getEquipo()) {
            if(jf!=null)
                System.out.println(jf.toString());
        }
    }

}
