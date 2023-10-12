package ejerciciosPOO.equipo;

public interface IPlantilla {

    int contarJunior();

    int contarSenior();

    int contarAlevines();

    void anadirJugador(Jugador j);

    boolean borrarJugador(int dorsal);

    Jugador buscarJugador(int dorsal);

}
