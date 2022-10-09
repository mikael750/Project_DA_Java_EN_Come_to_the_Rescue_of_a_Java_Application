package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Interface donnant l'accés à la méthode OrderSymptom
 */
public interface ISymptomOrder {

        void OrderSymptom(List<String> list, TreeMap<String, Integer> symptoms);

}
