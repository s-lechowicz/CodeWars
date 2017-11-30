package javaKata;

public class StringyStrings {
    public static String stringy(int size) {
        String output = "";

        if (size >= 1) {
            for (int i = 1; i <= size; i++) {
                if (i % 2 > 0) {
                    output += "1";
                } else {
                    output += "0";
                }
            }
        }
        return output;
    }
}
