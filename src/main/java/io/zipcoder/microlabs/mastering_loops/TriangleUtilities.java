package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String outcome = "";
        int i = 1;
        while (i < numberOfRows) {

            outcome += getRow(i) + "\n";
            i++;
            //System.out.println(outcome);
        }
        return outcome;
    }

    public static String getRow(int numberOfStars) {
        String outcome = "";
        int i = 0;
        while (i < numberOfStars) {
            outcome = outcome + "*";
            i++;
        }
        return outcome;
    }

    public static String getSmallTriangle() {
        String outcome = "";
        int i = 1;
        while (i < 5) {
            outcome += getRow(i) + "\n";
            i++;
            //System.out.println(outcome);
        }
        return outcome;
    }

    public static String getLargeTriangle() {
        String outcome = "";
        int i = 1;
        while (i < 10) {
            outcome = outcome + getRow(i) + "\n";
            i++;
            //System.out.println(outcome);
        }
        return outcome;
    }
}
