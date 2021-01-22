/**
    @author Kenneth Galvez, Juan Diego Avila, Daniel Gonzalez
    Modificacion: 20/01/2021

    Descripcion:
        Clase que permite la implementacion de las operaciones de la radio.
        Se realizan las funciones basicas para poder cambiar de emisora, de frecuencia,
        guardar emisoras en botones, encender y apagar la radio y mostrar su estado.
 */

import java.util.InputMismatchException;

public class RadioKAD implements RadioGeneral{

    //Atributos
    private boolean ON;

    private int emisoraActualAM;
    private double emisoraActualFM;

    private int frecuenciaActual;

    private int[] emisorasAM;
    private double[] emisorasFM;


    public RadioKAD() {
        //Al iniciar la radio siempre esta apagada.
        ON = false;

        //Para la frecuencia AM equivale a 0 y FM a 1.
        frecuenciaActual = 0;

        emisorasAM = new int[12];
        emisorasFM = new double[12];


        //La emisora inicia siempre en la mas baja.
        emisoraActualAM = 530;
        emisoraActualFM = 87.9;
    }


    public boolean isON(){
        /**Metodo que permite determinar si la radio esta encendida o no.*/
        return ON;
    }

    //Metodo que permite encender la radio.
    public void encender(){
        ON = true;
    }

    public void apagar() {
        ON = false;
    }

    public void incrementar() throws InputMismatchException {
        /** Este metodo permite aumentar la emisora en cualquier frecuencia.
         Cuando llega al limite estipulado para cada frecuencia, la emisora regresa al inicio.*/

        if(frecuenciaActual == 1){
            if(emisoraActualFM < 107.9){
                emisoraActualFM += 0.2;
            }
            else{
                emisoraActualFM = 87.9;
            }
        }
        else{
            if(emisoraActualAM < 1610){
                emisoraActualAM += 10;
            }
            else{
                emisoraActualAM = 530;
            }
        }
    }

    public boolean asignar(int a) throws InputMismatchException {
        /** Clase que permite asignar una emisora a un boton. */
        try {
            if(a >= 0 && a < 12) {
                if (frecuenciaActual == 0) {

                    emisorasAM[a] = emisoraActualAM;

                    if(emisoraActualAM == emisorasAM[a]){
                        return true;
                    }

                } else if (frecuenciaActual == 1) {

                    emisorasFM[a] = emisoraActualFM;

                    if(emisoraActualFM == emisorasFM[a]){
                        return true;
                    }
                }
            }
        }
        catch (InputMismatchException e){
            String ex = "El dato ingresado no es correcto.";
            throw new InputMismatchException(ex);
        }
        /**
         * Retorna verdadero si se logra asignar la emisora a un boton. De lo contrario, retorna falso.
         * @return boolean
         */
        return false;

    }

    public boolean emisoras(int a) throws InputMismatchException {
        /** Metodo que permite obtener la emisora guardada en un boton.*/
        try{
            if(frecuenciaActual==0){
                emisoraActualAM = (emisorasAM[a] == 0) ? emisoraActualAM : emisorasAM[a];
            }
            else{
                emisoraActualFM = (emisorasFM[a] == 0) ? emisoraActualFM : emisorasFM[a];
            }
        }
        catch (InputMismatchException e){
            String ex = "Ingreso incorrectamente el dato.";
            throw new InputMismatchException(ex);
        }
        /**
         * @return boolean
         */
        return true;

    }

    //Metodo que permite modificar la frecuencia de la radio de AM a FM.
    public void frecuencia(){
        /**Metodo que permite cambiar la frecuencia*/
        frecuenciaActual = (frecuenciaActual == 0) ? 1: 0;
    }


    public String toString(){
        String estado = "\n\n\nEstado de la radio\n";
        String emisora = (frecuenciaActual == 0) ? Integer.toString(emisoraActualAM) : Double.toString(emisoraActualFM);
        String frecuencia = (frecuenciaActual == 0) ? "AM": "FM";

        estado += "Frecuencia actual: " + frecuencia + "\n" + "Emisora actual: " + emisora + "\n\n\n";

        if(frecuenciaActual==0){
            //se encuentra en la frecuencia AM

            for(int i = 0; i<emisorasAM.length;i++){
                estado += "\t ["+(i+1)+"] "+emisorasAM[i] + "\n";
            }

        }else if(frecuenciaActual==1){
            //se encuentra en la frecuencia FM
            for(int i = 0; i<emisorasFM.length;i++){
                estado += "\t ["+(i+1)+"] "+emisorasFM[i] + "\n";
            }
        }
        return estado;
    }

}
