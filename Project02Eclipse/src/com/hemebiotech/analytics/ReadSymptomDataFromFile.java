package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 *
	 */
	public ReadSymptomDataFromFile() {
		this.filepath = filepath;
	}

	@Override
	public List<String> GetSymptoms(String filepath) {
		ArrayList<String> result = new ArrayList<String>();
		/**verifie si line est null à la premiere ligne de symptoms.txt*/
		if (filepath != null) {
			try {
				/**parcourir avec Buffer*/
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
