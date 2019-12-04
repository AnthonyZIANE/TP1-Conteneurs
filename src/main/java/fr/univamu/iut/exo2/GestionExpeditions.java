package fr.univamu.iut.exo2;

import fr.univamu.iut.Conteneur;

public class GestionExpeditions {
    public static void main(String[] args) {

        System.out.println(GestionDistances.getDistance("Barcelone"));
        System.out.println(GestionDistances.getDistance("Valence"));
        System.out.println(GestionDistances.getDistance("Alicante"));
        System.out.println(GestionDistances.getDistance("Malaga"));
        Conteneur c1 = new Conteneur("José", 123, "Valence");
        System.out.println(c1.toString());



        //throw new RuntimeException("Not yet implemented !");
    }
}
