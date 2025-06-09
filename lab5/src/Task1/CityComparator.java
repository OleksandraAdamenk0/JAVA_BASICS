package Task1;

import java.util.Comparator;

/**
 * CityComparator is a comparator used to compare two Tour objects
 * based on the alphabetical order of their destination cities.
 *
 * <p>This class implements the Comparator interface and overrides the
 * compare method to perform a case-insensitive comparison of the cities.</p>
 */
public class CityComparator implements Comparator<Tour> {
    /**
     * Compares two Tour objects by the name of the city in which the tour takes place.
     * Comparison is case-insensitive and follows lexicographical order.
     *
     * @param a the first Tour to compare
     * @param b the second Tour to compare
     * @return a negative integer, zero, or a positive integer if the city name of
     *         {@code a} is less than, equal to, or greater than the city name of {@code b}
     */
    @Override
    public int compare(Tour a, Tour b) { return a.getCity().compareToIgnoreCase(b.getCity());}
}
