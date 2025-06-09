package Task4;

public abstract class AbstractArrayOfPoints {
    public abstract void setPoint(int i, double x, double y);

    public abstract double getX(int i);
    public abstract double getY(int i);

    public abstract int count();

    public abstract void addPoint(double x, double y);

    public abstract void removeLast();

    public void sortByX() {
        boolean mustSort;
        do {
            mustSort = false;
            for (int i = 0; i < count() - 1; i++) {
                if (getX(i) > getX(i + 1)) {
                    // обмінюємо елементи місцями
                    double x = getX(i);
                    double y = getY(i);
                    setPoint(i, getX(i + 1), getY(i + 1));
                    setPoint(i + 1, x, y);
                    mustSort = true;
                }
            }
        }
        while (mustSort);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < count(); i++) {
            s += "x = " + getX(i) + " \ty = " + getY(i) + "\n";
        }
        return s + "\n";
    }

    public void test() {
        addPoint(22, 45);
        addPoint(4, 11);
        addPoint(30, 5.5);
        addPoint(-2, 48);
        sortByX();
        System.out.println(this);
    }
}
