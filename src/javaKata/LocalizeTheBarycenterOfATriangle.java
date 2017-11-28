package javaKata;

public class LocalizeTheBarycenterOfATriangle {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double[] sum = new double[2];
        sum[0] = Math.round(10000 * ((x[0] + y[0] + z[0]) / 3));
        sum[1] = Math.round(10000 * ((x[1] + y[1] + z[1]) / 3));
        sum[0] /= 10000;
        sum[1] /= 10000;
        return sum;
    }
}
