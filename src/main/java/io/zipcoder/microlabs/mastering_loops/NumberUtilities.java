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


//    public static String getOddNumbers(int start, int stop) {
//        String outcome = "";
//        for (int i = start; i < stop; i++){
//            if (i % 2 != 0) {
//                System.out.println(i);
//                outcome += i;
//            }
//
//        }
//        return outcome;
//    }

    ///////////BETTER METHOD USE STRINGBUILDER/////////
    public static String getOddNumbers(int start, int stop) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i++){
            if (i % 2 != 0) {
                System.out.println(i);
                str.append(String.valueOf(i));
            }

        }
        return str.toString();
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
        return getRange(0,stop,1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start,stop, 1);
    }

    public static String getRange(int start, int stop, int step) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i+=step){
            str.append(i);
        }
        return str.toString();
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String outcome = "";

        for (int i = start; i < stop; i += step) {

            double db = Math.pow(i, exponent);

            int result = (int)db;
            String.valueOf(result);
            //System.out.println(result);
            outcome += result;
        }
        return outcome;
    }
}
