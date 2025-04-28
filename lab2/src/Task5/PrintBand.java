package Task5;

/**
 * Utility class for printing information about a Band.
 */
public class PrintBand {

    /**
     * Prints the details of the given band, including its name, director, and all associated tours.
     *
     * @param band the band whose information is to be printed
     */
    public static void printBand(Band band) {
        System.out.printf("Band:\nName: %s\nLeader surname: %s\nTours:\n", band.getName(), band.getDirector());
        for (Tour tour : band.getTours()) {
            PrintTour.printTour(tour);
        }
    }
}