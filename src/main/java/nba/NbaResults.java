package nba;

import common.BaseMethods;

public class NbaResults extends BaseMethods {


    private final int brojKola = 1;
    private final int brojUtakmica = 10;
    private String[][] rasporedUtakmica;
    private int[][] rezultati;
    private int trenutnoKolo;

    public NbaResults(String[][] rasporedUtakmica) {
        this.rasporedUtakmica = rasporedUtakmica;
    }

    public NbaResults(int[][] rezultati) {
        this.rezultati = rezultati;
    }

    public NbaResults(int trenutnoKolo) {
        this.trenutnoKolo = trenutnoKolo;
    }

    public NbaResults(String[][] rasporedUtakmica, int[][] rezultati, int trenutnoKolo) {
        this.rasporedUtakmica = rasporedUtakmica;
        this.rezultati = rezultati;
        this.trenutnoKolo = trenutnoKolo;
    }

    public NbaResults() {



        rasporedUtakmica = new String[brojKola][brojUtakmica];
        rezultati = new int[brojKola][brojUtakmica];
        trenutnoKolo = 1;
    }

    public void objaviRezultate() {
        
        System.out.println("Rezultati za kolo " + trenutnoKolo + ":");
        for (int i = 0; i < rasporedUtakmica[trenutnoKolo - 1].length; i++) {
            String utakmica = rasporedUtakmica[trenutnoKolo - 1][i];
            int rezultat = rezultati[trenutnoKolo - 1][i];
            System.out.println(utakmica + ": " + rezultat);
        }
    }

}











