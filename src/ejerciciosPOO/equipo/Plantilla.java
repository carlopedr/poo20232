package ejerciciosPOO.equipo;

public class Plantilla implements IPlantilla {
    private Jugador [] equipo;
    public static final int MAXJUGADORES=25;

    public Plantilla(Jugador[] equipo) {
        this.equipo = equipo;
    }

    public Plantilla() {
        equipo=new Jugador[MAXJUGADORES];
    }
    
    

    public Jugador[] getEquipo() {
        return equipo;
    }

    public void setEquipo(Jugador[] equipo) {
        this.equipo = equipo;
    }
    
    @Override
    public int contarJunior() {
        int contJunior=0;
        for(Jugador j : equipo)
            if(j instanceof JugadorJunior)
                contJunior++;
        return contJunior-contarAlevines();    
    }

    @Override
    public int contarSenior() {
        int contSenior=0;
        for(Jugador j : equipo)
            if(j instanceof JugadorSenior)
                contSenior++;
        return contSenior;
    }

    @Override
    public int contarAlevines() {
        int contAlevin=0;
        for(Jugador j : equipo)
            if(j instanceof JugadorAlevin)
                contAlevin++;
        return contAlevin;
    }

    @Override
    public void anadirJugador(Jugador j) {
        //Validar el dorsal
        if(equipo[j.getDorsal()]==null){
            equipo[j.getDorsal()]=j;
            System.out.println("Jugador agregado!");
        }
        else{
            System.out.println("Dorsal ocupado!");
        }
            
        
    }

    @Override
    public boolean borrarJugador(int dorsal) {
        if(equipo[dorsal]!=null){
            equipo[dorsal]=null;
            return true;
        }
        else
            return false;
    }

    @Override
    public Jugador buscarJugador(int dorsal) {
        if(equipo[dorsal]!=null)
            return equipo[dorsal];
        else
            return null;
    }
}
