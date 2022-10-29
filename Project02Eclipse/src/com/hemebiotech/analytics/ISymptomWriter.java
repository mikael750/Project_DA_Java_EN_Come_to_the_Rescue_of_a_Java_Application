package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * Interface donnant l'acces a la methode WriteSymptom
 */
public interface ISymptomWriter{

    /**
     * @param symptoms les elements de la liste
     * @throws IOException retourne une exception si le fichier n'existe pas ou a un probleme de lecture de fichier.
     */
    void WriteSymptom(TreeMap<String, Integer> symptoms) throws IOException;

}
