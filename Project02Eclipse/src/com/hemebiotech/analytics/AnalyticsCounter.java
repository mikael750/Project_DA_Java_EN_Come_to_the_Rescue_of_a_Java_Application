package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;

public class AnalyticsCounter {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {

		/**

		int i = 0;
		while (line != null) {//à effacer
			i++;
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {//
				headacheCount++;
				System.out.println("number of headaches: " + headacheCount);
			}
			else if (line.equals("rash")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {/** contains compte le nombre du symptome nommé*
				pupilCount++;
			}

			line = reader.readLine();	/** get another symptom *
		}*/

		ReadSymptomDataFromFile symptomsReader = new ReadSymptomDataFromFile();

		/** generate output */
		FileWriter writer = new FileWriter ("result.out");
		List<String> list = symptomsReader.GetSymptoms("Project02Eclipse/symptoms.txt");
		for (String sym : list) {
			writer.write(sym + "\n");
		}
		writer.close();
		/**
		 writer.write("headache: " + headacheCount + "\n");
		 writer.write("rash: " + rashCount + "\n");
		 writer.write("dialated pupils: " + pupilCount + "\n");
		 writer.close();
		 * */
	}
}
