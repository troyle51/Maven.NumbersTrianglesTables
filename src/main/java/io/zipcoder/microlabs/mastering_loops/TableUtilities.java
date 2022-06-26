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
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }

    public static String printRow(int a) {
        String outcome = "";
        int i = a;
        while (i <= a) {
            outcome = outcome + String.format("%4d", i);
            i = i + 1;
        }
        return outcome;
    }


}
