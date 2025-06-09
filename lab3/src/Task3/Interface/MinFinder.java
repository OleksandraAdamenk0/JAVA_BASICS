package Task3.Interface;

public class MinFinder {
    static public double findMin(double start, double end, double step, InterfaceFunction IFunc) {
        if (start > end && step < 0) {
            double temp = start;
            start = end;
            end = temp;
            step = -step;
        } else if (start > end && step > 0) { return Double.NaN; }
        double min = IFunc.f(start++);
        while (start <= end) {
            if (IFunc.f(start) < min) { min = IFunc.f(start); }
            start += step;
        }
        return min;
    }
}
