package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.util.ArrayList;

public class GestionExpeditions {
    public static void main(String[] args)
    {
        Lecteur monLecteur = new Lecteur();
        ArrayList<Conteneur> maListe = monLecteur.charger("Conteneurs.ser");
        for (int i = 0 ; i < maListe.size() ; ++i)
            System.out.println(maListe.get(i).toString());
        //throw new RuntimeException("Not yet implemented !");
    }
}


