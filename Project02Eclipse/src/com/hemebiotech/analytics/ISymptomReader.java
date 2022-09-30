package com.hemebiotech.analytics;

import java.util.List;

/**
 * Tout ce qui permet de lire des données symptomatiques à partir d'une source.
 * La partie importante est, la valeur de retour de l'opération, qui est une liste de chaînes de caractères,
 * qui peut contenir de nombreux doublons
 *
 * L'implémentation n'a pas besoin d'ordonner la liste.
 * 
 */
public interface ISymptomReader {

	/**
	 * Si aucune donnée n'est disponible, retourner une liste vide.
	 * 
	 * @return une liste brute de tous les symptômes obtenus d'une source de données,
	 * les doublons sont possibles/probables.
	 */
	List<String> GetSymptoms(String filepath);
}
