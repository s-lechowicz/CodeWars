package javaKata;

public class AlternatingCase {
    public static String toAlternativeString(String str) {
        String out = "";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                out += Character.toLowerCase(c);
            } else {
                out += Character.toUpperCase(c);
            }
        }
        return out;
    }
}
