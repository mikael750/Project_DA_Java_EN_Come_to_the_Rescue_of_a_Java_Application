package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.TreeMap;

public class WriteSymptomDataFromFile implements ISymptomWriter {

    private String fileName;
    public WriteSymptomDataFromFile(String fileName){this.fileName = fileName;}

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
