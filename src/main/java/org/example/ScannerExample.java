package org.example;


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String name;
        String wohnort = "";

        // scan.nextInt(); für Integer Werte
        // scan.nextDouble(); für Double Werte usw.

        System.out.println("Bitte geben Sie ihren Namen ein: ");
        name = scan.next(); // Für Strings
        // System.out.println(scan.next()); -> Scan Werte entweder direkt ausgeben oder in Variable speichern!

        System.out.println("Bitte geben Sie ihren Wohnort ein: ");
        wohnort = scan.next(); // Für Strings
        if (wohnort.equals("Stuttgart"))
            System.out.println("Ungültige Eingabe!");


        System.out.println("Hallo " + name + ", aus " + wohnort+ "!");
    }

}