package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class OrderSymptomDataFromFile implements ISymptomOrder{

    public void OrderSymptom(List<String> list, TreeMap<String, Integer> symptoms){
        try {
            for (String sym : list) {
                /**
                 * On parcours chaque ligne de symptoms pour compter leurs occurences.
                 */
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
    }
}
