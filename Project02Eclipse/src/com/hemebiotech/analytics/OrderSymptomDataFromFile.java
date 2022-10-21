package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Contient la méthode OrderSymptom permettant d'ordonner une liste dans un fichier.
 */
public class OrderSymptomDataFromFile implements ISymptomOrder{

    /**
     * On parcours chaque ligne de symptoms pour compter leurs occurences.
     * @param list la liste des symptomes d'une manière non classé.
     * @return symptoms les élèments de la liste
     */
    public TreeMap<String, Integer> OrderSymptom(List<String> list){
        TreeMap<String, Integer> symptoms = new TreeMap();
        try {
            for (String sym : list) {
                if (symptoms.containsKey(sym)) {
                    int lineValue = symptoms.get(sym);
                    lineValue++;
                    symptoms.put(sym, lineValue);
                } else {
                    symptoms.put(sym, 1);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return symptoms;
    }
}
