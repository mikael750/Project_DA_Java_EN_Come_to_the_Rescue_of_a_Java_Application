package com.hemebiotech.analytics;

public class Program {

    static AnalyticsCounter process = new AnalyticsCounter();

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            process.execute();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
