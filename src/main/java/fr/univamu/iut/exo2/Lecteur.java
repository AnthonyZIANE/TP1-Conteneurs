package fr.univamu.iut.exo2;

import fr.univamu.iut.Conteneur;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Lecteur {
    public static SortedSet<Conteneur> charger(String fichier)
    {

        class SortArrayList implements Comparator<Conteneur>
        {

           public int compare (Conteneur conteneur1, Conteneur conteneur2)
           {

               return conteneur1.getDistance() - conteneur2.getDistance();
           }
        }

        SortedSet<Conteneur> maListe = new TreeSet<Conteneur>(new SortArrayList());

        try{
            File monFichier = new File(fichier);
            ObjectInputStream monStream = new ObjectInputStream(new FileInputStream(monFichier));

            try
            {
                while (true)
                {
                    Conteneur monConteneur = null;
                    monConteneur = (Conteneur) monStream.readObject();
                    if (monConteneur.getClass().equals(Conteneur.class))
                        maListe.add(monConteneur);
                }
            }
            catch (IOException ex)
            {
                System.out.println("Fin de fichier");
            }
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException" +
                    " is caught");
        }
        return maListe;
    }
}