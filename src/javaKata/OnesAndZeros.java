package javaKata;

import java.util.List;

public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return (binary.get(3) * 1) + (binary.get(2) * 2) + (binary.get(1) * 4) + (binary.get(0) * 8);
    }
}
