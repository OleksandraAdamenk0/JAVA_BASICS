package Task1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMusicBand extends AbstractMusicBand {
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
}