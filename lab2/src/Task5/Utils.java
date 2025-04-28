package Task5;

/**
 * Utility class providing helper methods to work with Band and Tour objects.
 */
public class Utils {
    /**
     * Finds the tour with the maximum number of concerts for the given band.
     *
     * @param band the band whose tours are to be analyzed
     * @return the tour with the highest number of concerts, or null if there are no tours
     */
    public static Tour findMaxConcertTour(Band band) {
        Tour[] tours = band.getTours();
        Tour maxConcertTour = null;
        for (Tour tour : tours) { if (maxConcertTour == null || tour.getConcerts() > maxConcertTour.getConcerts()) maxConcertTour = tour; }
        return maxConcertTour;
    }

    /**
     * Finds all tours of the given band that take place in the specified city.
     *
     * @param band the band whose tours are to be searched
     * @param city the city to filter the tours by
     * @return an array of tours in the specified city, or null if no tours are found
     */
    public static Tour[] findToursToCity(Band band, String city) {
        Tour[] tours = band.getTours();
        int lenth = 0;
        for (Tour tour : tours) if (tour.getCity().equals(city)) lenth++;
        if (lenth == 0) return null;
        Tour[] toursToCity = new Tour[lenth];
        int index = 0;
        for (Tour tour: tours) if (tour.getCity().equals(city)) toursToCity[index++] = tour;
        return toursToCity;
    }

    /**
     * Returns the last letter of the band's director's surname.
     *
     * @param band the band whose director's surname is to be analyzed
     * @return the last character of the director's surname
     */
    public static char findLastLetter(Band band) {
        String surname = band.getDirector();
        return surname.charAt(surname.length() - 1);
    }
}
