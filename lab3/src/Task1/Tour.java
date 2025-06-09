package Task1;

import java.util.Objects;

/**
 * The {@code Tour} class represents a musical tour event with information
 * about the city, date, and number of concerts held.
 *
 * <p>This class implements the {@link Comparable} interface to allow sorting
 * based on the number of concerts in ascending order.</p>
 */
public class Tour implements Comparable<Tour> {
    private String city;
    private String date;
    private int concerts;

    /**
     * Constructs a new Tour object with the specified city, date, and number of concerts.
     *
     * @param city     the city where the tour takes place
     * @param date     the date of the tour
     * @param concerts the number of concerts planned in this tour
     */
    Tour(String city, String date, int concerts) {
        this.city = city;
        this.date = date;
        this.concerts = concerts;
    }

    /**
     * Returns the number of concerts in this tour.
     *
     * @return the number of concerts
     */
    public int getConcerts() { return concerts; }

    /**
     * Returns the city where the tour takes place.
     *
     * @return the city of the tour
     */
    public String getCity() { return city; }

    /**
     * Returns the date of the tour.
     *
     * @return the tour date
     */
    public String getDate() { return date; }

    /**
     * Sets the city of the tour.
     *
     * @param city the new city name
     */
    public void setCity(String city) { this.city = city; }

    /**
     * Sets the number of concerts for the tour.
     *
     * @param concerts the new number of concerts
     */
    public void setConcerts(int concerts) { this.concerts = concerts; }

    /**
     * Sets the date of the tour.
     *
     * @param date the new tour date
     */
    public void setDate(String date) { this.date = date; }

    /**
     * Compares this tour with another based on the number of concerts.
     *
     * @param o the other tour to compare to
     * @return a negative integer, zero, or a positive integer as this tour
     *         has fewer, equal, or more concerts than the specified tour
     */
    @Override
    public int compareTo(Tour o) { return this.concerts - o.concerts; }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj the reference object with which to compare
     * @return {@code true} if this object is the same as the obj argument; {@code false} otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Tour that = (Tour) obj;
        return concerts == that.concerts && Objects.equals(city, that.city) && Objects.equals(date, that.date);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() { return Objects.hash(city, date, concerts); }
}
