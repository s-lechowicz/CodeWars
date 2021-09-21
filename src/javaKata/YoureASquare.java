package javaKata;

class YoureASquare {

    public static boolean isSquare(int number) {
        if(number <0) return false;

        double sqrt = Math.sqrt(number);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }
}
