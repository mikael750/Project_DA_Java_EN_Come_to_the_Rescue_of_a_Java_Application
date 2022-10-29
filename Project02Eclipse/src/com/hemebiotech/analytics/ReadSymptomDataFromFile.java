package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contient la methode GetSymptoms permettant de lire un fichier et d'enregister son contenu dans une liste.
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * @param filepath le fichier lu.
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * Lie chaque ligne d'un fichier pour les mettre dans une liste.
	 * verifie si line est null à la premiere ligne de symptoms.txt
	 * parcours filepath avec un Buffer
	 * @return une liste de tous les symptomes obtenus d'une source de donnees,les doublons sont present.
	 */
	@Override
	public List<String> GetSymptoms(){
		ArrayList<String> result = new ArrayList<String>();


		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
