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




    }
}
