package uj.wmii.pwj.introduction;

import static java.lang.Math.sqrt;

public class QuadraticEquation {

    public double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return new double[0];
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        } else {
            double root1 = (-b - sqrt(delta)) / (2 * a);
            double root2 = (-b + sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        }
    }
}