package javaKata;

public class CalculateStringRotation {
    static int shiftedDiff(String first, String second){
        return (first.length() != second.length()) ? -1 : (second+second).indexOf(first);
    }
}
