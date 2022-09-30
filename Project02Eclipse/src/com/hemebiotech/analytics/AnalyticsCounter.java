package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	/**
	 * Initialise les variable
	 */
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		/**
		 * get input sera dans la Class ReadSymptomDataFromFile.java
		 */
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();

		int i = 0;
		int headCount = 0;
		/**verif si line est null à la premier ligne */
		while (line != null) {
			i++;
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {//
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rush")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {/** contains compte le nombre du symptome nommé*/
				pupilCount++;
			}

			line = reader.readLine();	/** get another symptom */
		}
		
		/** generate output */
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
