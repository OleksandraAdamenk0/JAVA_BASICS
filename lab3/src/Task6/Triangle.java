package Task6;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void setC(double c) { this.c = c; }

    public double getArea() { return Math.sqrt((this.a + this.b + this.c) * (this.b + this.c - this.a) * (this.a + this.c - this.b) * (this.a + this.b - this.c)) / 4; }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
