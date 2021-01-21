/*
    Creadores: Kenneth Galvez, Juan Diego Avila, Daniel Gonzalez
    Modificacion: 20/01/2021

    Descripcion:
        Interfaz que permite definir las operaciones basicas para el uso
        de la radio.
 */

public interface Radio {

     boolean isON();
     void encender();
     void apagar();
     void incrementar();
     boolean asignar(int a);
     boolean emisoras(int a);
     void frecuencia();

}
