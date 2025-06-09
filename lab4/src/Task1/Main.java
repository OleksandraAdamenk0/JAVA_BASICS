package Task1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Tour[] tours = {
                new Tour("Kyiv",   "2025‑03‑28", 3),
                new Tour("Lviv",   "2025‑04‑02", 2),
                new Tour("Berlin", "2025‑04‑10", 5),
                new Tour("Warsaw", "2025‑04‑12", 1)
        };

        ArrayListMusicBand listBand = new ArrayListMusicBand("The Algorithms", "Ada");
        Arrays.stream(tours).forEach(listBand::addTour);

        SortedSetMusicBand setBandNat = new SortedSetMusicBand("The Algorithms", "Ada");
        Arrays.stream(tours).forEach(setBandNat::addTour);

        SortedSetMusicBand setBandByCity = new SortedSetMusicBand("The Algorithms", "Ada", Comparator.comparing(Tour::getCity, String.CASE_INSENSITIVE_ORDER));
        SortedSetMusicBand setBandByDate = new SortedSetMusicBand("The Algorithms", "Ada", Comparator.comparing(Tour::getDate));

        Arrays.stream(tours).forEach(t -> {
            setBandByCity.addTour(t);
            setBandByDate.addTour(t);
        });

        System.out.println("ArrayList order (insertion):");
        for (int i = 0; i < listBand.getTourLength(); i++) PrintTour.printTour(listBand.getTour(i));

        System.out.println("\nTreeSet order (by concerts ‑ natural):");
        for (Tour tour : setBandNat.getTours()) PrintTour.printTour(tour);

        System.out.println("\nTreeSet order (by city):");
        for (Tour tour : setBandByCity.getTours()) PrintTour.printTour(tour);

        System.out.println("\nTreeSet order (by date):");
        for (Tour tour : setBandByDate.getTours()) PrintTour.printTour(tour);

        int totalList  = totalConcerts(listBand);
        int totalNat   = totalConcerts(setBandNat);
        int totalByCity= totalConcerts(setBandByCity);
        int totalByDate= totalConcerts(setBandByDate);

        assert totalList == totalNat && totalNat == totalByCity && totalByCity == totalByDate : "Totals differ!";

        System.out.println("\n✔ All implementations give the same total concerts = " + totalList);
    }

    private static int totalConcerts(AbstractMusicBand band) {
        int sum = 0;
        for (int i = 0; i < band.getTourLength(); i++) sum += band.getTour(i).getConcerts();
        return sum;
    }
}
