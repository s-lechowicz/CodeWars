package javaKata;

import java.util.stream.Stream;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        return Stream.of(array1)
                .filter(s -> Stream.of(array2)
                        .anyMatch(x -> x.contains(s)))
                .sorted(String::compareTo)
                .toArray(String[]::new);
    }
}
