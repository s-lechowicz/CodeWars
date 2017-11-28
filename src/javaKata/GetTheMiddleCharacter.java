package javaKata;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        String c;
        int a = word.length() / 2;
        if (word.length() % 2 == 0) {
            c = Character.toString(word.charAt(a - 1)) + Character.toString(word.charAt(a));
        } else {
            c = Character.toString(word.charAt(a));
        }
        return c;
    }
}
