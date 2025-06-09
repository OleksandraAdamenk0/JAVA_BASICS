package Task1;

/**
 * Utility class for printing information about a Band.
 */
public class PrintBand {

    /**
     * Prints the details of the given band, including its name, director, and all associated tours.
     *
     * @param band the band whose information is to be printed
     */
    public static void printBand(AbstractMusicBand band) {
        System.out.printf("Band:\nName: %s\nLeader surname: %s\nTours:\n", band.getName(), band.getLeader());
        for (int i = 0; i < band.getTourLength(); i++) {
            PrintTour.printTour(band.getTour(i));
        }
    }
}
