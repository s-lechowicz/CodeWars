package javaKata;

public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        int result = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (String.valueOf(haystack[i]).equals("needle")) {
                result = i;
            }
        }
        return "found the needle at position " + result;
    }
}
