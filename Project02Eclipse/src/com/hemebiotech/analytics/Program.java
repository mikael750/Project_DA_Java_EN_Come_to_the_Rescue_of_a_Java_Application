package com.hemebiotech.analytics;

/**
 * Démarrage de l'application
 *
 * @author Mikaël Heyraud
 */
public class Program {

    static AnalyticsCounter process = new AnalyticsCounter();

    /**
     * La methode main demarre le programme en appellent execute
     *
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
