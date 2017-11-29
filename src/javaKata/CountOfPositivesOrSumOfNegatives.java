package javaKata;

public class CountOfPositivesOrSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int countOfPositives = 0;
        int sumOfNegatives = 0;

        if (input == null || input.length == 0) {
            return new int[0];
        } else {
            for (int x : input) {
                if (x > 0) {
                    countOfPositives += 1;
                } else {
                    sumOfNegatives += x;
                }
            }
        }
        return new int[]{countOfPositives, sumOfNegatives};
    }
}
