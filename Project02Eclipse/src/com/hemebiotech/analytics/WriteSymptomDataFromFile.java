package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.TreeMap;

/**
 * Contient la méthode WriteSymptom permettant d'ecrire une liste dans un fichier.
 */
public class WriteSymptomDataFromFile implements ISymptomWriter {

    private String fileName;

    /**
     * @param fileName le fichier lu.
     */
    public WriteSymptomDataFromFile(String fileName){this.fileName = fileName;}


    /**
     * @param symptoms les élèments de la liste
     */
    @Override
    public void WriteSymptom(TreeMap<String, Integer> symptoms) {
        try {
            FileWriter writer = new FileWriter(fileName);

            for (String val : symptoms.keySet()) {
                System.out.println(val + "=" + symptoms.get(val));
                writer.write(val + "=" + symptoms.get(val) + "\n");
            }
            writer.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

}
