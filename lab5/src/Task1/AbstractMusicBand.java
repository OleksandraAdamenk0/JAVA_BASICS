package Task1;

import java.io.Serializable;
import java.util.Objects;

/**
 * AbstractMusicBand is an abstract base class representing a generic music band.
 * It defines core properties such as the band's name and its leader,
 * and enforces the implementation of tour-related functionality in subclasses.
 *
 * <p>Subclasses must implement methods to retrieve tour information.</p>
 */
public abstract class AbstractMusicBand implements Serializable {
    private String name;
    private String leader;

    /**
     * Constructs an AbstractMusicBand with the specified name and leader.
     *
     * @param name   the name of the band
     * @param leader the leader of the band
     */
    AbstractMusicBand(String name, String leader) {
        this.name = name;
        this.leader = leader;
    }

    /**
     * Returns the tour at the specified index.
     *
     * @param index the index of the tour to return
     * @return the Tour object at the given index
     */
    public abstract Tour getTour(int index);

    /**
     * Returns the number of tours associated with the band.
     *
     * @return the total number of tours
     */
    public abstract int getTourLength();

    /**
     * Returns the name of the band.
     *
     * @return the band's name
     */
    public String getName() { return name; }

    /**
     * Returns the leader of the band.
     *
     * @return the leader's name
     */
    public String getLeader() { return leader; }

    /**
     * Sets the name of the band.
     *
     * @param name the new name for the band
     */
    public void setName(String name) { this.name = name; }

    /**
     * Sets the leader of the band.
     *
     * @param leader the new leader's name
     */
    public void setLeader(String leader) { this.leader = leader; }

    /**
     * Compares this music band to another for equality.
     * Two bands are considered equal if their names, leaders, and all tours are equal.
     *
     * @param o the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AbstractMusicBand that = (AbstractMusicBand) o;
        if (this.getTourLength() != that.getTourLength()) return false;
        for (int i = 0; i < this.getTourLength(); i++) if (!this.getTour(i).equals(that.getTour(i))) return false;
        return Objects.equals(name, that.name) && Objects.equals(leader, that.leader);
    }

    /**
     * Computes the hash code for the music band based on its name, leader, and tours.
     * Uses bit shifting and a multiplier to reduce hash collisions.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        int result = Objects.hash(name, leader);
        for (int i = 0; i < getTourLength(); i++) {
            // = 31, просте число, колізії
            result = (result << 5) - result + getTour(i).hashCode();
        }
        return result;
    }

    @Override
    public abstract String toString();
}
