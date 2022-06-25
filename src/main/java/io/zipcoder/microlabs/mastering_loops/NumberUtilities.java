package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String outcome = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 0) {
                System.out.println(i);
                outcome += i;
            }

        }
        return outcome;
    }


    public static String getOddNumbers(int start, int stop) {
        String outcome = "";
        for (int i = start; i < stop; i++){
            if (i % 2 != 0) {
                System.out.println(i);
                outcome += i;
            }

        }
        return outcome;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String outcome = "";
        for (int i = start; i < stop; i+=5){
            int b = i * i;
            System.out.println(b);
            outcome += b;
        }
        return outcome;
    }

    public static String getRange(int stop) {
        String outcome = "";
        for (int i = 0; i < stop; i++){
            outcome += i;
        }
        return outcome;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
