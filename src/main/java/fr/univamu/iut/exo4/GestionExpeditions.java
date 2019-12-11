package fr.univamu.iut.exo4;

import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo4.Chargement;
import fr.univamu.iut.exo4.GestionDistances;
import fr.univamu.iut.exo4.Lecteur;

import java.util.SortedSet;

public class GestionExpeditions {
    public static void main(String[] args) {

        Lecteur monLecteur = new Lecteur();
        SortedSet<Conteneur> maListe = monLecteur.charger("Conteneurs.ser");


        System.out.println(GestionDistances.getDistance("Barcelone"));
        System.out.println(GestionDistances.getDistance("Valence"));
        System.out.println(GestionDistances.getDistance("Alicante"));
        System.out.println(GestionDistances.getDistance("Malaga"));

         Chargement c = new Chargement(maListe);

         for (Conteneur aa : maListe)
             System.out.println(aa.toString());

         c.Debarquer();

         for (Conteneur cc : c.getchgt())
             System.out.println(c.toString());





        //throw new RuntimeException("Not yet implemented !");
    }
}