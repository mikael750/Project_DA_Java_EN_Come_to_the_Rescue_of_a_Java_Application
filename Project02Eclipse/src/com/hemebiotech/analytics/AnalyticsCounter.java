package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AnalyticsCounter {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile symptomsReader = new ReadSymptomDataFromFile();

		try{
			FileWriter writer = new FileWriter ("result.out");
			List<String> list = symptomsReader.GetSymptoms("Project02Eclipse/symptoms.txt");
			TreeMap<String, Integer> symptoms = new TreeMap<>();
			/**
			 * @param list liste les symptômes d'une manière non classé.
			 */

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
			/** generate output */
			for (String val : symptoms.keySet()) {
				System.out.println(val + "=" + symptoms.get(val));
				writer.write(val + "=" + symptoms.get(val) + "\n");
			}
//			List<String> distinctElements = newlist.stream().distinct().collect(Collectors.toList());
//			writer.write(String.valueOf(distinctElements));
			writer.close();

		}catch(IOException e){
			e.printStackTrace();
		}

	}
}
