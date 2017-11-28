package javaKata;

public class LarioAndMuigiPipeProblem {
    public static int[] pipeFix(int[] numbers) {

        int newTableSize = numbers[(numbers.length) - 1] - numbers[0] + 1;

        int[] out = new int[newTableSize];

        for (int i = 0; i < newTableSize; i++) {
            out[i] = numbers[0] + i;
        }
        return out;
    }
}
