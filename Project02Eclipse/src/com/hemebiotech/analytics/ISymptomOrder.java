package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Interface donnant l'accés à la méthode OrderSymptom
 */
public interface ISymptomOrder {

        TreeMap<String, Integer> OrderSymptom(List<String> list);

}
