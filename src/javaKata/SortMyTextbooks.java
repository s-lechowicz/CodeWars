package javaKata;

import java.util.List;

public class SortMyTextbooks {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String::compareToIgnoreCase);
        return textbooks;
    }
}
