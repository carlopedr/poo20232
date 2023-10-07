package ejerciciosPOO.cajaRegistradora;

public interface ICajaRegistradora {

    /* @return Nombre de la caja registradora */
    public String getNombre();

    /* @return Número de tipos de moneda que hay en la caja. */
    public int getNumTipoMonedas();

    /**
     * @param tipo
     * @return Devuelve el número de unidades del tipo de moneda pasado como
     * parámetro. -1 en el caso en el que el tipo de moneda no sea válido.
     */
    public int getUnidadesTipoMoneda(double tipo);

    /**
     * Ingresa el número de monedas indicado y del tipo indicado. * @param tipo
     *
     * @param unidades
     * @return true si los parÃ¡metros son vÃ¡lidos, false si no
     */
    public boolean meterMonedas(double tipo, int unidades);

    /**
     * Valida un tipo de moneda
     *
     * @param tipo
     * @return true si es válida, false si no
     */
    public boolean monedaValida(double tipo);

    /**
     * Extrae de la caja el número de unidades del tipo de moneda especificado
     *
     * @param tipo
     * @param unidades
     * @return true si ha sido posible, false en caso contrario.
     */
    public boolean sacarMonedas(float tipo, int unidades);

    /*Vacía la caja registradora. */
    public void vaciarCajaRegistradora();

    /*@return Devuelve un array con los tipos de monedas que tiene. */
    public double[] getTiposDeMonedas();

    /* @return Devuelve el saldo actual de la caja */
    public double getSaldo();
}
