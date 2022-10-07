package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {

		ISymptomReader symptomsReader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		ISymptomWriter symptomsWriter = new WriteSymptomDataFromFile("result.out");
		ISymptomOrder symptomOrder = new OrderSymptomDataFromFile();

		try{

			List<String> list = symptomsReader.GetSymptoms();
			TreeMap<String, Integer> symptoms = new TreeMap<>();
			/**
			 * @param list liste les symptômes d'une manière non classé.
			 */
			symptomOrder.OrderSymptom(list,symptoms);
			/**
			 * generate output
			 */
			symptomsWriter.WriteSymptom(symptoms);

		}catch(Exception e){
			e.printStackTrace();
		}

	}
}
