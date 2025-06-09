package Task3.AbstractClass;

public abstract class AbstractFunction {
    public abstract double f(double x);

    public double findMin(double start, double end, double step) {
        if (start > end && step < 0) {
            double temp = start;
            start = end;
            end = temp;
            step = -step;
        } else if (start > end && step > 0) { return Double.NaN; }
        double min = f(start++);
        while (start <= end) {
            if (f(start) < min) { min = f(start); }
            start += step;
        }
        return min;
    }
}
