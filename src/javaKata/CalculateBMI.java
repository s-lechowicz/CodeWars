package javaKata;

public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2.0);
        return bmi <= 18.5 ? "Underweight" :
                bmi <= 25.0 ? "Normal" :
                        bmi <= 30.0 ? "Overweight" : "Obese";
    }
}
