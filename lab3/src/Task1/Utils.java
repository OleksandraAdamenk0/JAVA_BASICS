package Task1;

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
    public static Tour findMaxConcertTour(AbstractMusicBand band) {
        Tour[] tours = new Tour[band.getTourLength()];
        for (int i = 0; i < band.getTourLength(); i++) tours[i] = band.getTour(i);
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
    public static Tour[] findToursToCity(AbstractMusicBand band, String city) {
        int lenth = 0;
        for (int i = 0; i < band.getTourLength(); i++) if (band.getTour(i).getCity().equals(city)) lenth++;
        if (lenth == 0) return null;
        Tour[] toursToCity = new Tour[lenth];
        for (int i = 0, j = 0; i < band.getTourLength(); i++) if (band.getTour(i).getCity().equals(city)) toursToCity[j++] = band.getTour(i);
        return toursToCity;
    }

    /**
     * Returns the last letter of the band's director's surname.
     *
     * @param band the band whose director's surname is to be analyzed
     * @return the last character of the director's surname
     */
    public static char findLastLetter(AbstractMusicBand band) {
        String surname = band.getLeader();
        return surname.charAt(surname.length() - 1);
    }
}
