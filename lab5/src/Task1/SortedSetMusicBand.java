package Task1;

import java.io.Serial;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMusicBand extends AbstractMusicBand {
    @Serial
    private static final long serialVersionUID = 1L;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()).append(";").append(this.getLeader()).append(";").append("Tours:\n");
        for (Tour tour : tours) {
            sb.append(tour.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static SortedSetMusicBand fromString(String input) {
        String[] lines = input.split("\n");
        String[] header = lines[0].split(";", 3);
        String name = header[0].trim();
        String leader = header[1].trim();

        SortedSetMusicBand band = new SortedSetMusicBand(name, leader);
        for (int i = 1; i < lines.length; i++) if (!lines[i].isBlank()) band.addTour(Tour.fromString(lines[i]));

        return band;
    }
}
