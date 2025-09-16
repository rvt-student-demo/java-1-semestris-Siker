package rvt;
import java.util.Scanner;

public class produkts {

        public static
        
        void main(String[] args) {

            Scanner reader = new Scanner(System.in);

            String nosaukums = reader.nextLine();
            
            double cena = reader.nextDouble();

            int skaits = reader.nextInt();

            System.out.println("Produks " + nosaukums + "\n" + "Cena " + cena + "\n" + "Skaits: " + skaits);
            System.out.println("Total Price: " + skaits * cena);
        }
}