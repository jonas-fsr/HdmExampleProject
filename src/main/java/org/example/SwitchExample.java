package org.example;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int zahl = scan.nextInt();
//        int zahl = 2;
        switch (zahl){
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            default:
                System.out.println("Ungültige Eingabe");
        }

        if (zahl == 2)
            System.out.println("Dienstag");
    }
}
