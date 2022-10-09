package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * Interface donnant l'accés à la méthode GetSymptoms
 */
public interface ISymptomReader {

	/**
	 * @return la liste des symptômes
	 * @throws IOException retourne une exception si le fichier n'existe pas ou à un problème de lecture de fichier.
	 */
	List<String> GetSymptoms() throws IOException;
}
