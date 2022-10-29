package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * Interface donnant l'acces a la methode GetSymptoms
 */
public interface ISymptomReader {

	/**
	 * @return la liste des symptomes
	 * @throws IOException retourne une exception si le fichier n'existe pas ou à un probleme de lecture de fichier.
	 */
	List<String> GetSymptoms() throws IOException;
}
