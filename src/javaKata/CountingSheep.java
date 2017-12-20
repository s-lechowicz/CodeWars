package javaKata;

import java.util.Arrays;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).filter(s -> Boolean.TRUE.equals(s)).toArray().length;
    }
}
