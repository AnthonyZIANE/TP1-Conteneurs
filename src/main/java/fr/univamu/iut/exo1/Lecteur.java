package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;

public class Lecteur {
    public static ArrayList<Conteneur> charger(String fichier)
    {
        ArrayList<Conteneur> maListe = new ArrayList<Conteneur>();
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