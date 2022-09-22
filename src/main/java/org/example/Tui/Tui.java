package org.example.Tui;

import org.example.Konto.Benutzer;

import java.util.ArrayList;
import java.util.Scanner;

public class Tui {

    private ArrayList<Benutzer> kontoList;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Benutzer> kontoList = new ArrayList<>();
        System.out.println("Herzlich Willkommen");

        System.out.println("Bitte Auswählen(0-5)");
        System.out.println("\t1 - Konto Erstellen");
        System.out.println("\t2 - Einloggen ");
        System.out.println("\t0 - Programm beenden\n");
        int choise = sc.nextInt();
        sc.nextLine();
        boolean isMenu = true;
        while (isMenu) {
            if (choise == 0) {
                System.out.println("Auf Wiedersehen");
                isMenu = false;
            } else if (choise == 1) {
                boolean create = true;
                while (create) {
                    System.out.println("Bitte Ihre Vorname und Nachname eingeben: ");
                    String createName = sc.nextLine();
                    System.out.println("Bitte Passwort eingeben: ");
                    String createPasswort = sc.next();
                    kontoList.add(new Benutzer(createName, createPasswort));
                    System.out.println("Wollen Sie noch ein Konto erstellen?(J/N)");
                    String choiseNoYes = sc.next();
                    if (choiseNoYes.equalsIgnoreCase("N")) {
                        create = false;
                    } else if (choiseNoYes.equalsIgnoreCase("Y")) {
                        create = true;
                    }
                }
            } else if (choise == 2) {
                System.out.println("Bitte Ihre Vorname und Nachname eingeben: ");
                String name = sc.nextLine();
                System.out.println("Bitte Passwort eingeben: ");
                String passwort = sc.next();
                System.out.println();
                System.out.printf("Hallo %s \n", name);

                System.out.println("Bitte auswählen");
                System.out.println("\t1-12 Monat");
                System.out.println("\t13 Ausgaben(Jahr)");
                System.out.println("\t0 Zurück");
                int month = sc.nextInt();
                boolean isMonth = true;
                while (isMonth) {
                    if (month == 0) {
                        isMonth = false;
                    }

                    else if (month == 13) {
                        System.out.println("Alle Ausgaben in diesem Jahr: ");
                    } else if (month > 13) {
                        System.out.println("Falsche eingabe");
                    }
                    else {
                        System.out.printf("Monat %d", month);
                        boolean monthWahl = true;
                        System.out.println("");

                        while(monthWahl) {
                            int month12 = sc.nextInt();
                            if (month12 == 0) {
                                monthWahl = false;
                            }
                            else {
                                System.out.println("");
                            }
                        }
                    }


                }
            }
        }
    }
}
