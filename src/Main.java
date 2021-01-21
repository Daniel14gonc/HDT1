/*
    Creadores: Kenneth Galvez, Juan Diego Avila, Daniel Gonzalez
    Modificacion: 20/01/2021

    Descripcion:
        Clase que permite crear la interaccion con el usuario para que
        pueda tener acceso a las funcionalidades de la radio.
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Radio radio = new RadioKAD();
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nBienvenido a la RadioKAD");
        System.out.print("\t Desea prender la radio? [si/no] ");

        if(scan.next().equals("si")){
            radio.encender();
        }else{
            System.out.println("no");
        }
        while(radio.isON()){

            System.out.println(radio.toString());
      
            System.out.println("\n\n\n\t1. Cambiar de frecuencia");
            System.out.println("\t2. Avanzar en el dial de las emisoras.");
            System.out.println("\t3. Guardar una emisora en una de los 12 botones.");
            System.out.println("\t4. Seleccionar la emisora puesta en un boton.");
            System.out.println("\t5. Apagar el radio. \t");
            
            System.out.print("\nEscoja una de las opciones -> ");
            
            int opcion = scan.nextInt();
            int posicion = 0;
            switch(opcion){
              case 1:
                radio.frecuencia();
                break;
      
              case 2:
                  radio.incrementar();
                break;
      
              case 3:
                System.out.print("Ingrese el boton donde desea guardarlo -> ");
                posicion = scan.nextInt()-1;
                if(posicion > 0 && posicion < 13){
                    radio.asignar(posicion);
                }
                else{
                    System.out.println("Ingrese una opcion correcta.");
                }

                break;
      
              case 4:
                System.out.print("Opcion -> ");
                posicion = scan.nextInt()-1;
                if(posicion > 0 && posicion < 13){
                    radio.emisoras(posicion);
                }
                else{
                    System.out.println("Ingrese una opcion correcta.");
                }
                radio.emisoras(posicion);
                break;
                
              case 5:
                radio.apagar();
                break;
              
            }
            
          }



    }
}
