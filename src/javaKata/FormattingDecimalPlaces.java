package javaKata;

import static java.lang.Math.round;

public class FormattingDecimalPlaces {
    public static double TwoDecimalPlaces(double number) {
        return (double) round(number * 100) / 100;
    }
}
