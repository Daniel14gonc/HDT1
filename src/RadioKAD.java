public class RadioKAD implements Radio{

    private boolean ON;

    private int emisoraActualAM;
    private double emisoraActualFM;

    private int frecuenciaActual;

    private int[] emisorasAM;
    private double[] emisorasFM;


    public RadioKAD(){
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
        return ON;
    }

    public void encender(){

        ON = true;

    }

    public void apagar(){

        ON = false;

    }



}
