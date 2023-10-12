package ejerciciosPOO.equipo;

import java.util.Scanner;

public class Inicio {
    
    private static Plantilla p;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p=new Plantilla();
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
        if(dorsal>25 || dorsal <1){
            System.out.println("Dorsal fuera de rango");
            return;
        }
        else{
            Jugador jb = p.buscarJugador(dorsal);
            if(jb!=null){
                System.out.println("Dorsal ocupado");
                return;
            }
        }
        sc.nextLine();
        System.out.print("Nombre:");
        nombre = sc.nextLine();
        System.out.print("Edad:");
        edad = sc.nextInt();
        sc.next();
        System.out.print("Tipo (N,A,J,S):");
        tipo = sc.nextLine();
        tipo = tipo.toUpperCase();
        switch (tipo.charAt(0)) {
            case 'A':
                System.out.print("Antiguedad:");
                ant = sc.nextInt();
                System.out.print("Nacionalidad:");
                nacion = sc.nextLine();
                if (edad <= 16) {
                    System.out.println("Jugador alevin - No cumple requisito de edad");
                } else {
                    JugadorAlevin jA = new JugadorAlevin(nacion, ant, nombre, dorsal, edad);
                }
                break;
            case 'J':
                System.out.print("Antiguedad:");
                ant = sc.nextInt();
                JugadorJunior jR = new JugadorJunior(ant, nombre, dorsal, edad);
                break;
            case 'S':
                System.out.print("Salario:");
                salario = sc.nextDouble();
                if (edad <= 18) {
                    System.out.println("Jugador Senior - No cumple requisito de edad");
                } else {
                    JugadorSenior jS = new JugadorSenior(salario, nombre, dorsal, edad);
                }

                break;
            default:
                Jugador j = new Jugador(nombre, dorsal, edad);

        }
    }

    private static void lista() {

    }

    private static void eliminar() {

    }

    private static void buscar() {

    }

}
