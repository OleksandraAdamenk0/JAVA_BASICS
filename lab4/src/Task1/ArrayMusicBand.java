package Task1;

/**
 * ArrayMusicBand is a concrete implementation of the AbstractMusicBand class,
 * using an array of Tour objects to store tour information.
 *
 * <p>This class also implements the Comparable interface to allow sorting
 * by the total number of concerts across all tours.</p>
 */
public class ArrayMusicBand extends AbstractMusicBand implements Comparable<ArrayMusicBand>{
    private Tour[] tours;

    /**
     * Constructs an ArrayMusicBand with the specified name, leader, and array of tours.
     *
     * @param name   the name of the band
     * @param leader the leader of the band
     * @param tours  the array of tours
     */
    ArrayMusicBand(String name, String leader, Tour[] tours) {
        super(name, leader);
        this.tours = tours;
    }

    /**
     * Returns the array of all tours.
     *
     * @return an array of Tour objects
     */
    public Tour[] getTours() { return tours; }

    /**
     * Sets the array of tours for the band.
     *
     * @param tours the new array of Tour objects
     */
    public void setTours(Tour[] tours) { this.tours = tours; }

    /**
     * Returns the Tour at the specified index in the array.
     *
     * @param index the index of the tour
     * @return the Tour at the given index, or null if the index is out of bounds
     */
    @Override
    public Tour getTour(int index) {
        if (index < 0 || index >= this.tours.length) return null;
        return this.tours[index];
    }

    /**
     * Returns the total number of tours in the array.
     *
     * @return the number of tours
     */
    @Override
    public int getTourLength() { return this.tours.length; }

    /**
     * Compares this band with another ArrayMusicBand based on the total number of concerts.
     *
     * <p>Returns a negative number if this band has fewer concerts, a positive number
     * if it has more, or zero if both have the same number of concerts.</p>
     *
     * @param o the other ArrayMusicBand to compare to
     * @return the result of comparing total concert counts
     */
    @Override
    public int compareTo(ArrayMusicBand o) {
        int thisConcerts = 0;
        int oConcerts = 0;
        for (Tour tour : this.tours) thisConcerts += tour.getConcerts();
        for (Tour tour : o.tours) oConcerts += tour.getConcerts();
        return thisConcerts - oConcerts;
    }
}
