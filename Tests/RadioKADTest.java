/*
    Creadores: Kenneth Galvez, Juan Diego Avila, Daniel Gonzalez
    Modificacion: 20/01/2021

    Descripcion:
        Clase para realizar pruebas unitarias.
 */

import static org.junit.Assert.*;

import java.util.Random;
import java.util.Scanner;

public class RadioKADTest {

    @org.junit.Test
    public void isOn() {
        //boolean tipo = false;
        RadioKAD instance = new RadioKAD();
        boolean expResult = false;
        boolean result = instance.isOn();
        assertEquals("Fallo el metodo",expResult, result);
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
        //prueba de la eleccion de una emisora.

        Radio radio = new RadioKAD();

        Random random = new Random();
        int recibido = random.nextInt(12);

        boolean prueba = radio.emisoras(recibido);
        assertEquals(true, prueba);
    }
}