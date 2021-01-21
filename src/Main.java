/**
    @author Kenneth Galvez, Juan Diego Avila, Daniel Gonzalez
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


                int opcion = 0;

                //se hace unicamente si el valor isON es true.
                while(opcion != 6){
                    if(!radio.isOn()){
                        System.out.print("\t Desea prender la radio? [si/no] ");

                        //define si se enciende o no la radio.
                        if(scan.next().equals("si")){
                            radio.encender();
                        }
                    }
                    else{
                        System.out.println(radio.toString());

                        System.out.println("\n\n\n\t1. Cambiar de frecuencia");
                        System.out.println("\t2. Avanzar en el dial de las emisoras.");
                        System.out.println("\t3. Guardar una emisora en una de los 12 botones.");
                        System.out.println("\t4. Seleccionar la emisora puesta en un boton.");
                        System.out.println("\t5. Apagar el radio. \t");
                        System.out.println("\t6. Salir. \t");

                        System.out.print("\nEscoja una de las opciones -> ");

                        opcion = scan.nextInt();
                        int posicion = 0;
                        switch(opcion){
                            case 1:
                                //opcion que permite cambiar la frecuencia de AM a FM a AM.
                                radio.frecuencia();
                                break;

                            case 2:
                                //Aumenta el valor para cambiar de emisoras.
                                radio.incrementar();
                                break;

                            case 3:
                                //recibe el numero de boton al que desea a signar una emisora.
                                System.out.print("Ingrese el boton donde desea guardarlo -> ");
                                posicion = scan.nextInt()-1;
                                try{
                                    radio.asignar(posicion);
                                }
                                catch (Exception e){
                                    System.out.println(e.getMessage());
                                }

                                break;

                            case 4:
                                //recibe el numero del boton para cambiar la emisora al seleccionado.
                                System.out.print("Opcion -> ");
                                posicion = scan.nextInt()-1;
                                //verifica que los valores se encuentren dentro del rango permitido.
                                try{
                                    radio.emisoras(posicion);
                                }
                                catch (Exception e){
                                    System.out.println(e.getMessage());
                                }

                                break;

                            case 5:
                                //asigna a isON el valor de false, terminando el programa.
                                radio.apagar();
                                break;

                            case 6:
                                System.out.println("Gracias por utilizar la radio.");
                                break;

                            default:
                                System.out.println("Ingrese un valor en el rango de 1 a 6 !");

                        }
                    }

                }

            }
        }