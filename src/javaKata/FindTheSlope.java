package javaKata;

public class FindTheSlope {

    public String slope(int[] points) {
        if ((points[2] - points[0]) == 0) {
            return "undefined";
        } else {
            int out = (points[3] - points[1]) / (points[2] - points[0]);
            return Integer.toString(out);
        }
    }
}
