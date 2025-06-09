package Task6;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Triangle[] triangles = {new Triangle(1, 2, 3), new Triangle(2, 3, 4), new Triangle(3, 4, 5)};

        for (Triangle t : triangles) { System.out.printf("%f\n", t.getArea()); }

        Arrays.sort(triangles, new Comparator<Triangle>() {
            @Override
            public int compare(Triangle t1, Triangle t2) { return Double.compare(t2.getArea(), t1.getArea()); }
        });

        System.out.println("Sorted areas:");
        for (Triangle t : triangles) { System.out.printf("%f\n", t.getArea()); }
    }
}
