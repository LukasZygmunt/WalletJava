package org.example.Konto;

public class Benutzer {
    private String name;
    private String passwort;

    public Benutzer(String name, String passwort) {
        this.name = name;
        this.passwort = passwort;
    }

    public String getName() {
        return name;
    }

    public String getPasswort() {
        return passwort;
    }
}
