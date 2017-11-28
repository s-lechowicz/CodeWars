package javaKata;

public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {

        int n = strarr.length;

        if (n == 0 || k > n | k <= 0) {
            return "";
        } else {

            String output = "";
            String max_length;

            for (int i = 0; i < n - k + 1; i++) {
                max_length = "";

                for (int j = 0; j < k; j++) {
                    max_length += strarr[i + j];
                }

                if (max_length.length() > output.length()) {
                    output = max_length;
                }
            }
            return output;
        }
    }
}
