package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayMusicBand[] arrayBandsToSort = {
                new ArrayMusicBand("Band 1", "Leader 1", new Tour[]{new Tour("City 1", "Date 1", 10), new Tour("Aity 2", "Date 2", 5)}),
                new ArrayMusicBand("Band 2", "Leader 2", new Tour[]{new Tour("Gity 1", "Date 1", 7), new Tour("City 2", "Date 2", 3)}),
                new ArrayMusicBand("Bamd 3", "Leader 3", new Tour[]{new Tour("Hity 1", "Date 1", 15), new Tour("Gity 2", "Date 2", 5)})
        };

        Arrays.sort(arrayBandsToSort);

        System.out.println("1 Sorted bands:");
        for (AbstractMusicBand a : arrayBandsToSort) PrintBand.printBand(a);

        for (ArrayMusicBand band : arrayBandsToSort) {
            Tour[] tours = band.getTours();
            Arrays.sort(tours, new CityComparator());
        }

        System.out.println("2 Sorted bands:");
        for (ArrayMusicBand a : arrayBandsToSort) for (Tour t : a.getTours()) PrintTour.printTour(t);
    }
}
