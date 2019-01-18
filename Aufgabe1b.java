package Blatt1;


import java.util.Scanner; // Scanner muss importiert werden, einfach enter auf scanner

public class Aufgabe1b {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in); // neuer scanner wird inkludiert der eingabe vom user empfangen kann
        // Scanner importieren (
        System.out.println("beliebige Zahl eingeben bitte ");
        int zahl= scanner.nextInt(); // weist den Wert den wir eingegeben haben der Variable Zahl zu


        int t= zahl/1000; // zahl durch tausend teilen um die Anzahl der tausender anzugeben
        System.out.println( t);

        int h= (zahl-t*1000)/100; // die tausender Zahlen müssen abgezogen werden da man nur die huderter wissen will
        // oder (zahl/100)%10 , zahl sp 1200 wird durch 10 geteilt --> 12 oder so --> modulo 10 --> 2 ist rest
        System.out.println(h);

 // number %= 100 --> number = number % 100
        int z= (zahl/10)%10;
        System.out.println(z);

        int e = (zahl-t*1000-h*100-z*10)/10;
        // oder (zahl/1)%10;
        System.out.println(e);


    }


}
