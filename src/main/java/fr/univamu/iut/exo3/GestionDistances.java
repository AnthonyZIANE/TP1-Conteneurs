package fr.univamu.iut.exo3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GestionDistances {

    public static HashMap<String, Integer> map;


    static{

        map = new HashMap<>();


        map.put("Barcelone", 183);
        map.put("Valence", 337);
        map.put("Alicante", 399);
        map.put("Malaga", 599);

    }



    public static Integer getDistance(String city)
    {
        return map.get(city);
    }

}
