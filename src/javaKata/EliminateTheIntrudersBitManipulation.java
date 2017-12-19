package javaKata;

public class EliminateTheIntrudersBitManipulation {
    public long eliminateSetBits(String number) {
        number = number.replace("0", "");

        return (long) (Math.pow(2, number.length()) - 1);
    }
}
