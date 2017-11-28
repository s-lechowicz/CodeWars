package javaKata;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {

    public static int countPassengers(ArrayList<int[]> stops) {
        int[] a;
        int out = 0;

        for (int i = 0; i < stops.size(); i++) {
            a = stops.get(i);
            out += (a[0] - a[1]);
        }
        return out;
    }
}
