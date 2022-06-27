package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String outcome = "";
        for(int i = 1; i < 6; i++){
            //outcome = outcome + String.format("%4d", i);
            //System.out.format("%4d |",i);
            for(int j = 1; j < 6; j++){
                outcome += String.format("%3d |",i * j);
                //System.out.format("%4d |",i * j);
            }
            outcome += "\n";
        }
        return outcome;
    }

    public static String getLargeMultiplicationTable() {
        String outcome = "";
        for(int i = 1; i < 11; i++){
            for(int j = 1; j < 11; j++){
                outcome += String.format("%3d |",i * j);
            }
            outcome += "\n";
        }
        return outcome;
    }

    public static String getMultiplicationTable(int tableSize) {
        String outcome = "";
        for(int i = 1; i < tableSize+1; i++){
            for(int j = 1; j < tableSize+1; j++){
                outcome += String.format("%3d |",i * j);
            }
            outcome += "\n";
        }
        return outcome;
    }
}
