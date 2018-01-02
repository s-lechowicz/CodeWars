package javaKata;

public class BusMastering {
    public static String arbitrate(String input, int n) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == '1' && !flag) {
                sb.append("1");
                flag = true;
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}
