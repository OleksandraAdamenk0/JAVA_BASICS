package Task1;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

public class SortedSetMusicBand extends AbstractMusicBand {
    private SortedSet<Tour> tours;

    public SortedSetMusicBand(String name, String leader) {
        super(name, leader);
        this.tours = new TreeSet<>();
    }

    public SortedSetMusicBand(String name, String leader, Comparator<Tour> cmp) {
        super(name, leader);
        this.tours = new TreeSet<>(cmp);
    }

    public void addTour(Tour tour) { tours.add(tour); }
    public SortedSet<Tour> getTours() { return tours; }

    @Override
    public Tour getTour(int index) {
        if (index < 0 || index >= tours.size()) return null;
        // TreeSet не підтримує random‑access, тому доводиться ітерувати
        int i = 0;
        for (Tour t : tours) if (i++ == index) return t;
        return null;
    }

    @Override
    public int getTourLength() { return tours.size(); }
}
