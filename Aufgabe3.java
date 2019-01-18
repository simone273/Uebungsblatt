package Blatt1;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in); // Scanner ist classe, scanner ist name,

        System.out.println("Gib deinen Namen ein: ");
        String name= scanner.next();

        System.out.println("Gib dein Alter ein: ");
        int alter= scanner.nextInt();

        System.out.println("Deine Name ist " +  name + " und dein alter " + alter);

        int alterTage = alter*365;
        System.out.println("Du bist mindestens " +alterTage+ " Tage alt");


        System.out.println("bitte Geburtsdatum eingeben");
        String geburtsdatum = scanner.next();





    }
}
