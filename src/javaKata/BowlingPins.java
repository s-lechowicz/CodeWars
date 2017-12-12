package javaKata;

public class BowlingPins {
    public String bowlingPins(int[] arr) {
        StringBuilder field = new StringBuilder("I I I I\n I I I \n  I I  \n   I   ");
        int[] pinsPosition = {27, 18, 20, 9, 11, 13, 0, 2, 4, 6};

        for (int element : arr) {
            field.setCharAt(pinsPosition[element - 1], ' ');
        }
        return field.toString();
    }
}
