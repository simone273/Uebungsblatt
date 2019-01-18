package Blatt1;

import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("bitte anzahl sekunden eingeben ");
        int sekunden= scanner.nextInt();

        System.out.println(sekunden + " entsprechen ");

        int jahre= 60*60*24*365;
        int tage = 60*60*24;
        int stunden = 60*60;
        int minuten =60;

        int zeitOhneJahre = sekunden%jahre;
        int zeitOhneTage = sekunden %tage;
        int zeitOhneStunden = sekunden % stunden;
        int zeitOhneMinuten = sekunden;


    }
}
