package Task5;

public class Circle implements Comparable {
    private double radius;

    public Circle(double rad) {
        this.radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Circle other)) {
            throw new ClassCastException("Compared object is not a Circle");
        }
        return Double.compare(this.radius, other.radius);
    }
}
