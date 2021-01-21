/*
    Creadores: Kenneth Galvez, Juan Diego Avila, Daniel Gonzalez
    Modificacion: 20/01/2021

    Descripcion:
        Clase para realizar pruebas unitarias.
 */

import static org.junit.Assert.*;

public class RadioKADTest {

    @org.junit.Test
    public void isON() {
    }

    @org.junit.Test
    public void asignar() {
        //Prueba de la asignacion de una emisora a un boton.
        Radio radio = new RadioKAD();

        boolean temp = radio.asignar(3);

        assertTrue("Fallo, no se asigno correctamento el boton", temp);
    }

    @org.junit.Test
    public void emisoras() {
    }
}