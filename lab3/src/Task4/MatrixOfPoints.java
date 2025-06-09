package Task4;

import java.util.Arrays;

public class MatrixOfPoints extends AbstractArrayOfPoints {
        private double[][] points = new double[0][2];

        @Override
        public void setPoint(int i, double x, double y) {
            points[i][0] = x;
            points[i][1] = y;
        }

        @Override
        public double getX(int i) { return points[i][0]; }

        @Override
        public double getY(int i) { return points[i][1]; }

        @Override
        public int count() { return points.length; }

        @Override
        public void addPoint(double x, double y) {
            points = Arrays.copyOf(points, points.length + 1);
            points[points.length - 1] = new double[]{x, y};
        }

        @Override
        public void removeLast() { if (points.length > 0) { points = Arrays.copyOf(points, points.length - 1); }}

}
