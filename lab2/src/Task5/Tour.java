package Task5;

/**
 * Represents a tour with a specific city, date, and number of concerts.
 */
public class Tour {
    private String city;
    private String date;
    private int concerts;

    /**
     * Constructs a Tour object with the specified city, date, and number of concerts.
     *
     * @param city     the city where the tour takes place
     * @param date     the date of the tour
     * @param concerts the number of concerts in the tour
     */
    Tour(String city, String date, int concerts) {
        this.city = city;
        this.date = date;
        this.concerts = concerts;
    }

    /**
     * Returns the city of the tour.
     *
     * @return the city name
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the date of the tour.
     *
     * @return the tour date
     */
    public String getDate() {
        return date;
    }

    /**
     * Returns the number of concerts in the tour.
     *
     * @return the number of concerts
     */
    public int getConcerts() {
        return concerts;
    }

    /**
     * Sets the city of the tour.
     *
     * @param city the new city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets the date of the tour.
     *
     * @param date the new tour date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Sets the number of concerts in the tour.
     *
     * @param concerts the new number of concerts
     */
    public void setConcerts(int concerts) {
        this.concerts = concerts;
    }
}


