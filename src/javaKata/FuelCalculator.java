package javaKata;

public class FuelCalculator {
    public static double fuelPrice(int litres, double pricePerLiter) {

        double discount = (double) (Math.floor(litres / 2)) * 0.05D;

        if (discount > 0.25) {
            discount = 0.25;
        }
        return litres * (pricePerLiter - discount);
    }
}
