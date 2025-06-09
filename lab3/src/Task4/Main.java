package Task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test for matrix:");
        AbstractArrayOfPoints matrixOfPoints = new MatrixOfPoints();
        matrixOfPoints.test();

        System.out.println("Test for list:");
        AbstractArrayOfPoints listOfPoints = new ListOfPoints();
        listOfPoints.test();
    }
}
