package javaKata;

public class SumOfNumbersFrom0toN {
    public static String showSequence(int value) {

        String output = "0";

        if (value < 0) {
            output = Integer.toString(value) + "<0";
        } else if (value == 0) {
            output = "0=0";
        } else {
            int calc = 0;
            for (int i = 1; i <= value; i++) {
                calc += i;
                output += "+" + Integer.toString(i);
            }
            output += " = " + Integer.toString(calc);
        }
        return output;
    }
}
