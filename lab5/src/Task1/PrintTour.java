package Task1;

/**
 * Utility class for printing information about a Tour.
 */
public class PrintTour {

    /**
     * Prints the details of the given tour, including city, date, and number of concerts.
     *
     * @param tour the tour whose information is to be printed
     */
    public static void printTour(Tour tour) {
        System.out.printf("Tour:\nCity: %s\nDate: %s\nConcerts: %s\n",
                tour.getCity(),
                tour.getDate(),
                String.valueOf(tour.getConcerts()));
    }
}
