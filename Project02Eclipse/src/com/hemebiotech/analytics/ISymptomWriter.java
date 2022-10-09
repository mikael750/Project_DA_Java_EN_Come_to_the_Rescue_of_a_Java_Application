package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * Interface donnant l'accés à la méthode WriteSymptom
 */
public interface ISymptomWriter{

    /**
     * @param symptoms les élèments de la liste
     * @throws IOException retourne une exception si le fichier n'existe pas ou à un problème de lecture de fichier.
     */
    void WriteSymptom(TreeMap<String, Integer> symptoms) throws IOException;

}
