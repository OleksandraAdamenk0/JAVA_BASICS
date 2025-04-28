package Task5;

/**
 * Represents a musical band with a name, a director, and a list of tours.
 */
public class Band {
    private String name;
    private String director;
    private Tour[] tours;

    /**
     * Constructs a Band object with the specified name, director, and tours.
     *
     * @param name     the name of the band
     * @param director the director of the band
     * @param tours    the array of tours associated with the band
     */
    Band(String name, String director, Tour[] tours) {
        this.name = name;
        this.director = director;
        this.tours = tours;
    }

    /**
     * Returns the name of the band.
     *
     * @return the band's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the director of the band.
     *
     * @return the band's director
     */
    public String getDirector() {
        return director;
    }

    /**
     * Returns the array of tours associated with the band.
     *
     * @return an array of the band's tours
     */
    public Tour[] getTours() {
        return tours;
    }

    /**
     * Sets the name of the band.
     *
     * @param name the new name of the band
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the director of the band.
     *
     * @param director the new director of the band
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Sets the array of tours for the band.
     *
     * @param tours the new array of tours
     */
    public void setTours(Tour[] tours) {
        this.tours = tours;
    }
}

