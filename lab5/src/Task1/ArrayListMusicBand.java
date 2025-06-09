package Task1;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMusicBand extends AbstractMusicBand {
    @Serial
    private static final long serialVersionUID = 1L;
    private List<Tour> tours = new ArrayList<>();

    public ArrayListMusicBand(String name, String leader) {
        super(name, leader);
    }

    public ArrayListMusicBand(String name, String leader, List<Tour> tours) {
        super(name, leader);
        this.tours.addAll(tours);
    }

    public void addTour(Tour tour) { this.tours.add(tour); }

    @Override
    public Tour getTour(int index) {
        if (index < 0 || index >= tours.size()) return null;
        return tours.get(index);
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


    public static ArrayListMusicBand fromString(String input) {
        String[] lines = input.split("\n");
        String[] header = lines[0].split(";", 3);
        String name = header[0].trim();
        String leader = header[1].trim();

        List<Tour> tours = new ArrayList<>();
        for (int i = 1; i < lines.length; i++) if (!lines[i].isBlank()) tours.add(Tour.fromString(lines[i]));

        return new ArrayListMusicBand(name, leader, tours);
    }

}