package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {


	/**
	 * genere la sortie result.out à partir de la liste symtoms.txt grace aux méthode
	 */
	public void execute() {

		ISymptomReader symptomsReader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		ISymptomWriter symptomsWriter = new WriteSymptomDataFromFile("result.out");
		ISymptomOrder symptomOrder = new OrderSymptomDataFromFile();

		try{

			List<String> list = symptomsReader.GetSymptoms();
			TreeMap<String, Integer> symptoms = symptomOrder.OrderSymptom(list);
			symptomsWriter.WriteSymptom(symptoms);

		}catch(Exception e){
			e.printStackTrace();
		}

	}
}
