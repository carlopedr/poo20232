package ejerciciosPOO.equipo;

public class Test {

    public static void main(String[] args) {
        Jugador j = new Jugador("Leonel", 10, 34);
        JugadorAlevin jA = new JugadorAlevin("COL", 2, "Mateo", 23, 16);
        JugadorJunior jJ = new JugadorJunior(4, "Kevin", 19, 19);
        JugadorSenior jS = new JugadorSenior(100000, "Radamel", 9, 37);
        //Jugador[] equipo = {j, jA, jJ, jS, jA, jA, jJ, jS, jS, jS};
        //Jugador[] equipo=new Jugador[25];
        Plantilla p = new Plantilla();
        p.anadirJugador(j);
        p.anadirJugador(j);
        p.anadirJugador(jA);
        p.anadirJugador(jJ);
        p.anadirJugador(jS);
        for (Jugador jf : p.getEquipo()) {
            if(jf!=null)
                System.out.println(jf.toString());
        }
        System.out.println("Cant.Alevin: "+p.contarAlevines());
        System.out.println("Cant.Junior: "+p.contarJunior());
        System.out.println("Cant.Senior: "+p.contarSenior());
        
        System.out.println("Borrado: " + p.borrarJugador(10));
        System.out.println("Borrado: " + p.borrarJugador(10));
        
        Jugador jb =p.buscarJugador(23);
        System.out.println("Buscado: "+jb.toString());
        Jugador jb1 =p.buscarJugador(21);
        if(jb1 == null)
            System.out.println("Buscado: "+null);
        
        
    }
}
