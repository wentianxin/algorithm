package org.tisong.util;


import org.tisong.stdlib.StdDraw;
import org.tisong.stdlib.StdOut;
import org.tisong.stdlib.StdRandom;

/**
 * Created by tisong on 10/28/16.
 */
public class VisualAccumulator {

    private double total;

    private int N;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    public void addDataValue(double val) {
        N++;
        total +=  val;

        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total/N);
    }

    public double mean() {
        return total / N;
    }

    public String toString() {
        return "Mean (" + N + " values): "
                + String.format("%7.5f", mean());
    }

    public static void main(String[] args) {
        int T = 2000;

        VisualAccumulator a = new VisualAccumulator(T, 1.0);

        for (int i = 0; i < T; i++) {

            double d = StdRandom.random();
            StdOut.print(d + "\t");
            a.addDataValue(d);
        }

        StdOut.println(a);
    }
}
