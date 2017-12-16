package javaKata;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortMyTextbooksTest {
    @Test
    public void basicTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        for (String s : new String[]{"Algebra", "History", "Geometry", "English"})
            strs.add(s);
        for (String s : new String[]{"Algebra", "English", "Geometry", "History"})
            sorted.add(s);
        assertEquals(sorted, SortMyTextbooks.sort(strs));
    }

    @Test
    public void capitalizationTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        for (String s : new String[]{"Algebra", "history", "Geometry", "english"})
            strs.add(s);
        for (String s : new String[]{"Algebra", "english", "Geometry", "history"})
            sorted.add(s);
        assertEquals(sorted, SortMyTextbooks.sort(strs));
    }

    @Test
    public void symbolsTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        for (String s : new String[]{"Alg#bra", "$istory", "Geom^try", "**English"})
            strs.add(s);
        for (String s : new String[]{"$istory", "**English", "Alg#bra", "Geom^try"})
            sorted.add(s);
        assertEquals(sorted, SortMyTextbooks.sort(strs));
    }
}