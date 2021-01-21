/*
    Creadores: Kenneth Galvez, Juan Diego Avila, Daniel Gonzalez
    Modificacion: 20/01/2021

    Descripcion:
        Interfaz que permite definir las operaciones basicas para el uso
        de la radio.
 */

public interface Radio {

     //Metodo que permite determinar si la radio esta encendida.
     boolean isON();

     //Metodo que permite encender la radio.
     void encender();

     //Metodo que permite apagar la radio.
     void apagar();

     //Metodo que permite incrementar la frecuencia de la radio.
     void incrementar();

     //Metodo que permite asignar una emisor a un boton.
     boolean asignar(int a);

     //Metodo que permite elegir un boton.
     boolean emisoras(int a);

     //Metodo que permite modificar la frecuencia de la radio.
     void frecuencia();

}
