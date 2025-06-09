package Task4;

import java.util.Arrays;

public class ListOfPoints extends AbstractArrayOfPoints{

    private double[] points = new double[0];

    @Override
    public void setPoint(int i, double x, double y) {
        points[i * 2] = x;
        points[i * 2 + 1] = y;
    }

    @Override
    public double getX(int i) { return points[i * 2]; }

    @Override
    public double getY(int i) { return points[i * 2 + 1]; }

    @Override
    public int count() { return points.length / 2; }

    @Override
    public void addPoint(double x, double y) {
        points = Arrays.copyOf(points, points.length + 2);
        points[points.length - 2] = x;
        points[points.length - 1] = y;
    }

    @Override
    public void removeLast() { if (points.length >= 2) { points = Arrays.copyOf(points, points.length - 2); }}
}
