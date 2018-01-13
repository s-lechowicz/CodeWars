package javaKata;

import java.util.Collections;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return repeat < 0 ? "" : String.join("", Collections.nCopies(repeat, string));
    }
}
