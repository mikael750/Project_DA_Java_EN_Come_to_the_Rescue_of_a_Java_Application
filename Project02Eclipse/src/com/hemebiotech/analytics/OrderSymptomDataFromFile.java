package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

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
                    int linevalue = symptoms.get(sym);
                    linevalue++;
                    symptoms.put(sym, linevalue);
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
