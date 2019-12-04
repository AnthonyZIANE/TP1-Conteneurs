package fr.univamu.iut.exo3;

import fr.univamu.iut.Conteneur;

import java.util.ArrayDeque;
import java.util.SortedSet;

public class Chargement {
    private ArrayDeque<Conteneur> dq;
    public Chargement (SortedSet<Conteneur> c)
    {
        dq = new ArrayDeque<>();
        dq.addAll(c);
    }

    void Embarquer(Conteneur x)
    {
        dq.push(x);
    }

    void Debarquer()
    {
        dq.pop();
    }

    public ArrayDeque<Conteneur>getchgt()
    {
        return dq;
    }
}
