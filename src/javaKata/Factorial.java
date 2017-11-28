package javaKata;

public class Factorial {

    public int factorial(int n) {

        int output = 1;

        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
        } else {
            for (int i = 2; i <= n; i++) {
                output *= i;
            }
        }
        return output;
    }
}