package org.example;

import java.util.Scanner;

public class SchleifenExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hallo, ich bin ein Chatbot. Wie ist dein Name?");
        String name = scan.next();
        System.out.println("Hallo " + name + ", wie geht es dir?");
        String befinden = "";
        befinden = scan.next();
        while (!befinden.equals("gut") && !befinden.equals("schlecht")) {
            System.out.println("Das war leider nicht richtig, versuche es nochmal!");
            befinden = scan.next();
        }
        System.out.println("Dir geht es " + befinden);


    }
}
