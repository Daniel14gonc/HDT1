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
      
            switch(opcion){
              case 1:
                radio.frecuencia();
                break;
      
              case 2:
                  radio.incrementar();
                break;
      
              case 3:
                System.out.print("Opcion -> ");
                int posicion = scan.nextInt()-1;
                radio.asignar(posicion);
                break;
      
              case 4:
                System.out.print("Opcion -> ");
                int posicion = scan.nextInt()-1;
                radio.emisoras(posicion);
                break;
                
              case 5:
                radio.apagar();
                break;
              
            }
            
          }



    }
}
