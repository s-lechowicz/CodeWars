package javaKata;

public class CountTheMonkeys {
    public static int[] monkeyCount(final int n) {
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = i + 1;
        }
        return out;
    }
}
